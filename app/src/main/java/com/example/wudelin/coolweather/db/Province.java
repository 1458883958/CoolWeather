package com.example.wudelin.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wudelin on 2017/11/19.
 */

public class Province extends DataSupport {
    private int id;               //每个实体类应有的字段
    private String provinceName;  //记录省名
    private int procinceCode;     //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProcinceCode() {
        return procinceCode;
    }

    public void setProcinceCode(int procinceCode) {
        this.procinceCode = procinceCode;
    }
}
