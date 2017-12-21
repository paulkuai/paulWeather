package com.paul.paulweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by paul on 21/12/2017.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private String cideCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCideCode() {
        return cideCode;
    }

    public void setCideCode(String cideCode) {
        this.cideCode = cideCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
