package com.example.tidu.codeforces;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CodeforcesApi {
    @GET("user.info")
    Call<User> getUser(@Query("handles") String userName);
}
