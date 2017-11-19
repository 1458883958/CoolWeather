package com.example.wudelin.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wudelin on 2017/11/19.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().url(address).build();

        okHttpClient.newCall(request).enqueue(callback);
    }
}
