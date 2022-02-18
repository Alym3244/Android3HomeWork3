package com.example.android3homework3.network;



import com.example.android3homework3.network.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabyApi {
    @GET("/api?key=25767702-174d96176f04a908f9632dcc9")
    Call<PixabayResponse> getImage(@Query("q")String keyWord );



}
