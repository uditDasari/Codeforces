package com.example.tidu.codeforces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://codeforces.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CodeforcesApi codeforcesApi = retrofit.create(CodeforcesApi.class);
        Call<User> call = codeforcesApi.getUser();
    }
}
