package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;

/**
 * Created by Rommel on 17.6.8.
 */

public class Now {
    @SerializedName("tem")
    public String temperature;
    @SerializedName("cond")
    public  More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
