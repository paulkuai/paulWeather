package com.paul.paulweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul on 21/12/2017.
 */

public class Now {
    @SerializedName("cloud")
    public String cloud;

    @SerializedName("cond_code")
    public String condCode;

    @SerializedName("cond_txt")
    public String condTxt;

    @SerializedName("fl")
    public String fl;

    @SerializedName("hum")
    public String hum;

    @SerializedName("pcpn")
    public String pcpn;

    @SerializedName("pres")
    public String pres;

    @SerializedName("tmp")
    public String tmp;

    @SerializedName("vis")
    public String vis;

    @SerializedName("wind_deg")
    public String windDeg;

    @SerializedName("wind_dir")
    public String windDir;

    @SerializedName("wind_sc")
    public String windSc;

    @SerializedName("wind_spd")
    public int windSpd;

}
