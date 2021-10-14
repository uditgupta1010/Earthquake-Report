package com.example.android.quakereport;

public class EarthquakeDetail {

    private  String magnitude;
    private String place;
    private String place_offset;
    private String time;
    private String time1;
    private String url;

    public EarthquakeDetail(String p_magnitude, String p_place, String p_time, String p_time1, String p_place_offset, String p_url){
        magnitude = p_magnitude;
        place = p_place;
        time = p_time;
        time1 = p_time1;
        place_offset = p_place_offset;
        url = p_url;
    }

    public String getMagnitude(){
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }

    public String getTime1() {
        return time1;
    }

    public String getPlace_offset() {
        return place_offset;
    }

    public String getUrl() {
        return url;
    }
}
