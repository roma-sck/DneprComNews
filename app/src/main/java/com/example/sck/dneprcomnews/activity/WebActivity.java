package com.example.sck.dneprcomnews.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.sck.dneprcomnews.R;

public class WebActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_webview);

        WebView webView = (WebView) findViewById(R.id.webView);

        // get url selected news from NewsListFragment
        Bundle bundle = this.getIntent().getExtras();
        String url = bundle.getString(getString(R.string.intent_extra_name_url));

        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl(url);
    }
}