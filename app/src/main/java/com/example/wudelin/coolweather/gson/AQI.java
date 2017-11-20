package com.example.wudelin.coolweather.gson;

/**
 * Created by wudelin on 2017/11/19.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
