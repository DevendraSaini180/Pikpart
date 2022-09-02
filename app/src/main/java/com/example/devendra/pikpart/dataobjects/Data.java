
package com.example.devendra.pikpart.dataobjects;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable {

    @SerializedName("announcements")
    private List<Announcement> mAnnouncements;
    @SerializedName("bannerList")
    private List<BannerList> mBannerList;
    @SerializedName("nearByGarages")
    private List<NearByGarage> mNearByGarages;
    @SerializedName("offerOnAmc")
    private List<OfferOnAmc> mOfferOnAmc;
    @SerializedName("offers")
    private List<Object> mOffers;
    @SerializedName("product")
    private Product mProduct;
    @SerializedName("servicePackages")
    private List<Object> mServicePackages;
    @SerializedName("services")
    private List<Service> mServices;
    @SerializedName("todayFeatures")
    private List<TodayFeature> mTodayFeatures;
    @SerializedName("trendingProducts")
    private List<TrendingProduct> mTrendingProducts;
    @SerializedName("upcomingEvents")
    private List<UpcomingEvent> mUpcomingEvents;

    public List<Announcement> getAnnouncements() {
        return mAnnouncements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        mAnnouncements = announcements;
    }

    public List<BannerList> getBannerList() {
        return mBannerList;
    }

    public void setBannerList(List<BannerList> bannerList) {
        mBannerList = bannerList;
    }

    public List<NearByGarage> getNearByGarages() {
        return mNearByGarages;
    }

    public void setNearByGarages(List<NearByGarage> nearByGarages) {
        mNearByGarages = nearByGarages;
    }

    public List<OfferOnAmc> getOfferOnAmc() {
        return mOfferOnAmc;
    }

    public void setOfferOnAmc(List<OfferOnAmc> offerOnAmc) {
        mOfferOnAmc = offerOnAmc;
    }

    public List<Object> getOffers() {
        return mOffers;
    }

    public void setOffers(List<Object> offers) {
        mOffers = offers;
    }

    public Product getProduct() {
        return mProduct;
    }

    public void setProduct(Product product) {
        mProduct = product;
    }

    public List<Object> getServicePackages() {
        return mServicePackages;
    }

    public void setServicePackages(List<Object> servicePackages) {
        mServicePackages = servicePackages;
    }

    public List<Service> getServices() {
        return mServices;
    }

    public void setServices(List<Service> services) {
        mServices = services;
    }

    public List<TodayFeature> getTodayFeatures() {
        return mTodayFeatures;
    }

    public void setTodayFeatures(List<TodayFeature> todayFeatures) {
        mTodayFeatures = todayFeatures;
    }

    public List<TrendingProduct> getTrendingProducts() {
        return mTrendingProducts;
    }

    public void setTrendingProducts(List<TrendingProduct> trendingProducts) {
        mTrendingProducts = trendingProducts;
    }

    public List<UpcomingEvent> getUpcomingEvents() {
        return mUpcomingEvents;
    }

    public void setUpcomingEvents(List<UpcomingEvent> upcomingEvents) {
        mUpcomingEvents = upcomingEvents;
    }

}
