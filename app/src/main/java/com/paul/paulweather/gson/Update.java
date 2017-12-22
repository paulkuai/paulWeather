package com.paul.paulweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul on 21/12/2017.
 */

public class Update {

    @SerializedName("loc")
    public String updateTimelOC;

    @SerializedName("utc")
    public String updateTimeUTC;
}
