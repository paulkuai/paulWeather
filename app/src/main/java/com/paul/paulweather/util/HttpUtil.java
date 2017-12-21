package com.paul.paulweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by paul on 21/12/2017.
 */

public class HttpUtil {

    /**
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
