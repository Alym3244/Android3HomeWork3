package com.example.android3homework3;

import android.app.Application;

import com.example.android3homework3.network.PixabyApi;
import com.example.android3homework3.network.RetrofitClient;


public class App extends Application {
    public static RetrofitClient retrofitClient;
    public  static PixabyApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api= retrofitClient.providePixabayApi();
    }
}
