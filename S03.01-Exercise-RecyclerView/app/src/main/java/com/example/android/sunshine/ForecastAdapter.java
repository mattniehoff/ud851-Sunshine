package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Matt on 2/5/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    ForecastAdapter(){

    }

    private String[] weatherData;

    public void setWeatherData(String[] weatherData){
        this.weatherData = weatherData;
        notifyDataSetChanged();
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutId = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutId, parent, false);
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.weatherTextView.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        if (weatherData == null) {
            return 0;
        }

        return weatherData.length;
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView weatherTextView;

        public ForecastAdapterViewHolder(View view){
            super(view);

            weatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }
}
