package com.example.devendra.pikpart.services;

import com.example.devendra.pikpart.dataobjects.ProductsRequest;
import com.example.devendra.pikpart.dataobjects.ProductsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("utilities/homePageMob")
    Call<ProductsResponse> getProducts(@Body ProductsRequest post);
}
