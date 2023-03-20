package com.example.wbvwtst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wbvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wbvw =(WebView) findViewById(R.id.wbvw);


    }

    public void go(View view) {
        wbvw.setWebViewClient(new WebViewClient());
        wbvw.getSettings().setJavaScriptEnabled(true);
        String adr="https://www.google.com/";
        wbvw.loadUrl(adr);
        wbvw.setWebViewClient(new MyWebViewClient());
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}