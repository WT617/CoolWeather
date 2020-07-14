package com.example.coolweather.gson;

public class AQI {
    public AQICity city;

    //定义AQICity类是因为json文件中city是一个对象，有两个属性
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
