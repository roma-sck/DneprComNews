package com.example.sck.dneprcomnews.api;

import com.example.sck.dneprcomnews.models.NewsObject;

import retrofit.Call;
import retrofit.http.GET;

public interface DneprComApi {
    // HTTP request to the API
    @GET(ApiConst.API_PREFIX + ApiConst.API_KEY)
    Call<NewsObject> getFreshNews();
}
