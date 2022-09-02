package com.example.devendra.pikpart.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.devendra.pikpart.R;
import com.example.devendra.pikpart.databinding.LayoutRecyclerviewTrendingProductsBinding;
import com.example.devendra.pikpart.dataobjects.TrendingProduct;

import java.util.List;

public class TrendingProductAdapter extends RecyclerView.Adapter<TrendingProductAdapter.ViewHolder> {

    private final List<TrendingProduct> mList;
    private final Context mContext;

    public TrendingProductAdapter(Context context, List<TrendingProduct> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutRecyclerviewTrendingProductsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.layout_recyclerview_trending_products, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final TrendingProduct product = mList.get(position);
        setProductImage(product.getImageUrl(), holder.mBinding.imageViewProduct, holder.mBinding.textViewImageContent);
        setDiscountText(holder.mBinding.textViewDiscount, product.getDiscount());
        setProductName(holder.mBinding.textViewProductName, product.getName());

    }

    private void setProductName(AppCompatTextView textViewProductName, String name) {
        textViewProductName.setText(name);
    }

    private void setDiscountText(AppCompatTextView textViewDiscount, Long discount) {
        String result = discount + "%" + " OFF";
        textViewDiscount.setText(result);
    }

    private void setProductImage(String imageUrl, AppCompatImageView imageViewProduct, AppCompatTextView textViewImageContent) {
        if (imageUrl != null || !TextUtils.isEmpty(imageUrl)) {
            Glide.with(mContext).load(imageUrl).centerCrop().into(imageViewProduct);
        }

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        LayoutRecyclerviewTrendingProductsBinding mBinding;

        public ViewHolder(LayoutRecyclerviewTrendingProductsBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
}
