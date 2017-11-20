package com.example.wudelin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wudelin on 2017/11/20.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Tmeperature temperature;

    @SerializedName("cond")
    public More more;

    public class Tmeperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
