package com.example.wudelin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wudelin on 2017/11/19.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;  //记录县名
    private String weatherId;   //记录县所对应天气ID
    private int cityId;         //所属市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
