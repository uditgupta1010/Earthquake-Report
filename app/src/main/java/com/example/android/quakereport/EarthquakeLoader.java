package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<EarthquakeDetail>> {

    private String url;
    public static final String LOG_TAG = EarthquakeLoader.class.getName();

    public EarthquakeLoader(Context context, String p_url) {
        super(context);
        url = p_url;
    }

    @Override
    protected void onStartLoading() {
        Log.e(LOG_TAG, "The onStartLoading of the EarthquakeLoader is called");
        forceLoad();
    }

    @Override
    public ArrayList<EarthquakeDetail> loadInBackground() {
        Log.e(LOG_TAG, "The loadInBackground of the Earthquake Loader is called");
        if(url.equals("") || url.length() < 1)
            return null;

        return QueryUtils.fetchEarthquakeData(url);
    }
}
