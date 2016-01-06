package com.example.sck.dneprcomnews.api;

import com.example.sck.dneprcomnews.models.NewsObject;

import de.greenrobot.event.EventBus;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public final class ApiController {

    // Create a REST adapter
    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ApiConst.API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    // Create an instance of our DneprComApi API interface.
    private static final DneprComApi service = retrofit.create(DneprComApi.class);


    public static void getNews() {
        // Create a call instance for getting news.
        Call<NewsObject> call = service.getFreshNews();

        call.enqueue(new Callback<NewsObject>() {
            // Successful HTTP response.
            @Override
            public void onResponse(Response<NewsObject> response, Retrofit retrofit) {
                EventBus.getDefault().post(response);
            }
            // Unsuccessful HTTP response due to network failure, non-2XX status code, or unexpected exception.
            @Override
            public void onFailure(Throwable t) {
                EventBus.getDefault().post(t.getMessage());
            }
        });
    }
}