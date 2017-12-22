package com.paul.paulweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul on 21/12/2017.
 */

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("cnty")
    public String countryName;

    @SerializedName("parent_city")
    public String parentCityName;

    @SerializedName("admin_area")
    public String admin_area;

    @SerializedName("lat")
    public float Location_Lat;

    @SerializedName("lon")
    public float Location_lon;

    @SerializedName("tz")
    public float timeZone;

}
