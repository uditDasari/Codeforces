package com.example.tidu.codeforces;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.submitBtn);
        editText = findViewById(R.id.etUserName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().trim().isEmpty())
                    Toast.makeText(MainActivity.this, "Enter yout username pls", Toast.LENGTH_SHORT).show();
                else
                {
                    String string = editText.getText().toString();
                    SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("SP",0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("UN",string);
                    editor.apply();
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://codeforces.com/api/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    CodeforcesApi codeforcesApi = retrofit.create(CodeforcesApi.class);
                    Call<User> call = codeforcesApi.getUser(string);
                    call.enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call, Response<User> response) {
                            if (!response.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Code: " + response.code(), Toast.LENGTH_SHORT).show();
                                return;
                            }
                            User user = response.body();
                            Intent i = new Intent(MainActivity.this,Info.class);
                            List<User.Result> list = user.getResult();
                            User.Result result = list.get(0);
                            i.putExtra("DP",result.getAvatar());
                            i.putExtra("H",result.getHandle());
                            i.putExtra("R",result.getRating());
                            i.putExtra("HR",result.getMaxrating());
                            i.putExtra("C",result.getCountry());
                            startActivity(i);
                            finish();

                        }
                        @Override
                        public void onFailure(Call<User> call, Throwable t) {
                            Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });


        //Call<User> call = codeforcesApi.getUser();
    }
}
