package com.coolweather.android.gson;

/**
 * Created by Mr_Ming on 2017/5/27.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
