package com.example.devendra.pikpart.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.devendra.pikpart.R;
import com.example.devendra.pikpart.databinding.LayoutProductBannerBinding;
import com.example.devendra.pikpart.dataobjects.ProductBanner;

import java.util.List;

public class ProductBannerAdapter extends RecyclerView.Adapter<ProductBannerAdapter.ViewHolder> {

    private final List<ProductBanner> mList;
    private final Context mContext;

    public ProductBannerAdapter(Context context, List<ProductBanner> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ProductBannerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutProductBannerBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.layout_product_banner, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductBannerAdapter.ViewHolder holder, int position) {
        final ProductBanner productBanner = mList.get(position);
        setProductBanner(holder.mBinding.imageViewProductBanner, productBanner.getImageUrl());
    }

    private void setProductBanner(AppCompatImageView imageViewProductBanner, String imageUrl) {
        Glide.with(mContext).load(imageUrl).into(imageViewProductBanner);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        LayoutProductBannerBinding mBinding;

        public ViewHolder(LayoutProductBannerBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
}
