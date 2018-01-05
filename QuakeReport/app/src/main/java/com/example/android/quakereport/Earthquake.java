package com.example.android.quakereport;

/**
 * Created by kakrya on 7/27/2017.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
