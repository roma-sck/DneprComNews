package com.example.sck.dneprcomnews.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sck.dneprcomnews.R;
import com.example.sck.dneprcomnews.models.DneprComNews;

import java.util.List;

public class NewsListAdapter extends BaseAdapter {

    private List<DneprComNews> mListData;
    private LayoutInflater mInflater;
    private Typeface mTypeface;

    public NewsListAdapter(Context context, List<DneprComNews> mListData) {
        this.mListData = mListData;
        mInflater = LayoutInflater.from(context);
        this.mTypeface = Typeface.MONOSPACE;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View view, ViewGroup parent) {
        NewsItem news;
        if (view == null) {
            view = mInflater.inflate(R.layout.list_item, null);
            news = new NewsItem();
            news.newsTitle = (TextView) view.findViewById(R.id.newsTitle);
            news.newsDateTime = (TextView) view.findViewById(R.id.newsDateTime);
            news.newsImage = (ImageView) view.findViewById(R.id.newsImage);
            view.setTag(news);
        } else {
            news = (NewsItem) view.getTag();
        }

        DneprComNews item = mListData.get(position);

        news.newsDateTime.setTypeface(mTypeface);
        news.newsTitle.setTypeface(mTypeface);

        news.newsTitle.setText(item.getNewsTitle().getText());
        news.newsDateTime.setText(item.getNewsDateTime());

        news.newsImage.setImageResource(R.drawable.temp_img);

        return view;
    }

    static class NewsItem {
        TextView newsTitle;
        TextView newsDateTime;
        ImageView newsImage;
    }
}