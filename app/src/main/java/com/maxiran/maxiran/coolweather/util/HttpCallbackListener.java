package com.maxiran.maxiran.coolweather.util;

public interface HttpCallbackListener {
    void onFinish(String response);
    void  onError(Exception e);
}
