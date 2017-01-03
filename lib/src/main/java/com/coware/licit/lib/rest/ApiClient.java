package com.coware.licit.lib.rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bolorundurowb on 12/29/16.
 */

public class ApiClient {
    private static final String API_URL = "http://licit.com/api";
    private static LicitInterface REST_CLIENT;

    static {
        setupRestClient();
    }

    public static LicitInterface getRestClient() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        REST_CLIENT = retrofit.create(LicitInterface.class);
    }
}
