package com.paul.paulweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by paul on 21/12/2017.
 */

public class Weather {
    public String status;

    public Basic basic;

    public Now now;

    public Update update;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
