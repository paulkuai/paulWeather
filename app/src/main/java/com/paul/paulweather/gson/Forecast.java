package com.paul.paulweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul on 21/12/2017.
 */

public class Forecast {

    public String date;

    @SerializedName("cond_txt_d")
    public String condTxtN;

    public String tmp_max;

    public String tmp_min;


}
