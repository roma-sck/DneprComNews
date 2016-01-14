package com.example.sck.dneprcomnews.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.sck.dneprcomnews.R;
import com.example.sck.dneprcomnews.activity.WebActivity;
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
public class MainFragment extends Fragment {

    private ListView mNewsListView;
    private LinearLayout mProgressBar;
    private List<DneprComNews> mNewsList;

    public MainFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        EventBus.getDefault().register(this);

        ApiController.getNews();

        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mNewsListView = (ListView) view.findViewById(R.id.newsList);
        mProgressBar = (LinearLayout) view.findViewById(R.id.progressLayout);

        // set onClick method to open news url in WebView
        mNewsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedNewsLink = mNewsList.get(position).getNewsTitle().getHref();
                Intent newActivity = new Intent(getActivity(), WebActivity.class);
                newActivity.putExtra("url", selectedNewsLink);
                startActivity(newActivity);
            }

            @SuppressWarnings("unused")
            public void onClick(View v) {
            }
        });

        return view;
    }

    /**
     * Successful retrofit responce - shows mNewsList
     *
     * @param response retrofit responce
     */
    public void onEvent(Response<NewsObject> response) {
        mNewsList = response.body().getResults().getDneprComNews();

        mNewsListView.setAdapter(new NewsListAdapter(getActivity(), mNewsList));

        mProgressBar.setVisibility(View.GONE);
    }

    /**
     * Unsuccessful retrofit responce
     *
     * @param errMsg retrofit error message
     */
    public void onEvent(String errMsg) {
        mProgressBar.setVisibility(View.GONE);

        showErrorDialog(errMsg);
    }

    private void showErrorDialog(String err) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.retrofit_err_diag_title);
        builder.setMessage(getString(R.string.retrofit_err_diag_message) + err);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }
}
