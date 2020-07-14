package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 由于JSON中的某些字段不适合直接作为Java字段来命名，这里使用@SerializedName注解的方式来建立JSON字段和Java字段之间的映射关系
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
