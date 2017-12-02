package com.example.dream.diyizhou_moni;

import com.example.dream.diyizhou_moni.bean.NewsBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dream on 2017/12/1.
 */

public interface Service {
    //http://api.tianapi.com/keji/?key=ac87b4a4e634eb4a4e96fd371490a667&num=10
    @GET("/keji/?key=ac87b4a4e634eb4a4e96fd371490a667&num=10")
    Call<NewsBean> getData();
}
