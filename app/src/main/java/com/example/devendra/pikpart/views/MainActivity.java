package com.example.devendra.pikpart.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.devendra.pikpart.R;
import com.example.devendra.pikpart.databinding.ActivityMainBinding;
import com.example.devendra.pikpart.dataobjects.ObjectHash;
import com.example.devendra.pikpart.dataobjects.ProductBanner;
import com.example.devendra.pikpart.dataobjects.ProductsRequest;
import com.example.devendra.pikpart.dataobjects.ProductsResponse;
import com.example.devendra.pikpart.dataobjects.QueryParamHash;
import com.example.devendra.pikpart.dataobjects.TrendingProduct;
import com.example.devendra.pikpart.services.ApiClient;
import com.example.devendra.pikpart.services.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fetchProducts();
    }

    private void fetchProducts() {
        ApiInterface apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);

        ProductsRequest post = prepareProductRequest();

        Call<ProductsResponse> call = apiInterface.getProducts(post);
        call.enqueue(new Callback<ProductsResponse>() {
            @Override
            public void onResponse(Call<ProductsResponse> call, Response<ProductsResponse> response) {
                mBinding.progressBar.setVisibility(View.GONE);

                if (response.isSuccessful()) {

                    ProductsResponse result = response.body();
                    if (result != null) {

                        List<ProductBanner> productBanners = result.getResponseResult().getResult().getData().getProduct().getProductBanner();
                        if (productBanners != null && !productBanners.isEmpty()) {
                            mBinding.recyclerviewProductBanner.setVisibility(View.VISIBLE);
                            initializeProductBannerRecyclerView(productBanners);
                        }

                        List<TrendingProduct> trendingProductList = result.getResponseResult().getResult().getData().getTrendingProducts();
                        if (trendingProductList != null && !trendingProductList.isEmpty()) {
                            mBinding.recyclerviewTrendingProducts.setVisibility(View.VISIBLE);
                            initializeTrendingProductRecyclerView(trendingProductList);
                        }
                    }
                }

            }

            @Override
            public void onFailure(Call<ProductsResponse> call, Throwable t) {
                mBinding.progressBar.setVisibility(View.GONE);
                t.printStackTrace();

            }
        });
    }

    private void initializeProductBannerRecyclerView(List<ProductBanner> productBanners) {
        mBinding.recyclerviewProductBanner.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mBinding.recyclerviewProductBanner.setAdapter(new ProductBannerAdapter(this, productBanners));
    }

    private void initializeTrendingProductRecyclerView(List<TrendingProduct> list) {
        mBinding.recyclerviewTrendingProducts.setLayoutManager(new GridLayoutManager(this, 3));
        mBinding.recyclerviewTrendingProducts.setAdapter(new TrendingProductAdapter(this, list));
    }

    private ProductsRequest prepareProductRequest() {
        ProductsRequest productsRequest = new ProductsRequest();

        ObjectHash objectHash = new ObjectHash();
        objectHash.setLatitude(25.6256436);
        objectHash.setLongitude(83.0038971);
        objectHash.setVehicleId(2316);

        QueryParamHash queryParamHash = new QueryParamHash();
        queryParamHash.setActionId("homePageMob");

        productsRequest.setObjectHash(objectHash);
        productsRequest.setQueryParamHash(queryParamHash);

        return productsRequest;
    }
}