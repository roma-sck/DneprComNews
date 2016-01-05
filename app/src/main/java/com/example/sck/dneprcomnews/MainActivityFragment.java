package com.example.sck.dneprcomnews;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sck.dneprcomnews.adapter.NewsListAdapter;
import com.example.sck.dneprcomnews.api.ApiController;
import com.example.sck.dneprcomnews.models.DneprComNews;
import com.example.sck.dneprcomnews.models.NewsObject;

import java.util.List;

import de.greenrobot.event.EventBus;
import retrofit.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ListView mNewsListView;

    public MainActivityFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        EventBus.getDefault().register(this);

        ApiController.getNews();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mNewsListView = (ListView) view.findViewById(R.id.newsList);

        return view;
    }

    public void onEvent(Response<NewsObject> response) {
        List<DneprComNews> mNewsList = response.body().getResults().getDneprComNews();

        mNewsListView.setAdapter(new NewsListAdapter(getActivity(), mNewsList));
    }

    public void onEvent(String errMsg) {
        Toast.makeText(getActivity(), errMsg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }
}
