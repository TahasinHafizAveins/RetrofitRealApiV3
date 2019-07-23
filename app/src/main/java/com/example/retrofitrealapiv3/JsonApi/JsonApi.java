package com.example.retrofitrealapiv3.JsonApi;

import com.example.retrofitrealapiv3.ApiFatchHandle.User;
import com.example.retrofitrealapiv3.ApiPostHandle.PostData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonApi {

    @GET("/api/users")
    Call<List<User>> getPosts();

    @FormUrlEncoded
    @POST("/api/users/register")
    Call<PostData>createPost(
            @Field("email") String email,
            @Field("name") String name,
            @Field("contact") String contact,
            @Field("address") String address
    );
}

