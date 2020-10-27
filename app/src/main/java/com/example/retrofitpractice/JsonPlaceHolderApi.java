package com.example.retrofitpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {


    //Annotated with @GET
    @GET("posts")
    //Get Json Object from the Post array
    Call<List<Post>> getPosts();
}