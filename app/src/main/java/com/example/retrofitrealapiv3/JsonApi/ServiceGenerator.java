package com.example.retrofitrealapiv3.JsonApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static final String BASE_URL = "http://192.168.1.106:8880";

    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
//            .readTimeout(60, TimeUnit.SECONDS)
//            .connectTimeout(60, TimeUnit.SECONDS)
            .build();


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient);


    private static Retrofit retrofit = builder.build();


    public static <S> S createService(
            Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
