package com.example.myapplication.interfaces;

import com.example.myapplication.models.Post;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    @GET("/posts")
    Call<ArrayList<Post>> getAllPost();
}
