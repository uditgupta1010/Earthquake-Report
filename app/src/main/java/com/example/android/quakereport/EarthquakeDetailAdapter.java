package com.example.android.quakereport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;

import java.util.ArrayList;

public class EarthquakeDetailAdapter extends ArrayAdapter<EarthquakeDetail> {

    private static final String LOG_TAG = EarthquakeDetailAdapter.class.getSimpleName();

    public EarthquakeDetailAdapter(Activity context, ArrayList<EarthquakeDetail> earthquakeDetails) {
        super(context, 0, earthquakeDetails);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        EarthquakeDetail currentEarthquakeDetail = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        assert currentEarthquakeDetail != null;
        magnitudeTextView.setText(currentEarthquakeDetail.getMagnitude());
        String mag = currentEarthquakeDetail.getMagnitude();
        double e_mag = Double.parseDouble(mag);

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();


        int e_magnitude = (int) Math.floor(e_mag);

        switch (e_magnitude){
            case 0:
            case 1:
                int magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude1);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 2:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude2);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 3:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude3);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 4:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude4);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 5:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude5);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 6:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude6);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 7:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude7);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 8:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude8);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            case 9:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude9);
                magnitudeCircle.setColor(magnitude1Color);
                break;
            default:
                magnitude1Color = ContextCompat.getColor(getContext(), R.color.magnitude10plus);
                magnitudeCircle.setColor(magnitude1Color);
                break;
        }

        TextView place_offsetTextView = (TextView) listItemView.findViewById(R.id.place_offset);
        place_offsetTextView.setText(currentEarthquakeDetail.getPlace_offset());

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place);
        placeTextView.setText(currentEarthquakeDetail.getPlace());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
        timeTextView.setText(currentEarthquakeDetail.getTime());

        TextView time1TextView = (TextView) listItemView.findViewById(R.id.time1);
        time1TextView.setText(currentEarthquakeDetail.getTime1());

        return listItemView;
    }
}
