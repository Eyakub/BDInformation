package com.easytechhub.helloeyakub.bdinformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eyakub on 10/31/2017.
 */

public class CityAdapter extends BaseAdapter {

    Context c;
    ArrayList<City> cityArrayList;

    @Override
    public int getCount() {
        return cityArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)
                c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View listView_inflate = layoutInflater.inflate(R.layout.information, null);

        ImageView image = listView_inflate.findViewById(R.id.imageCity);
        image.setImageResource(cityArrayList.get(position).getImages());

        TextView info = listView_inflate.findViewById(R.id.informationCity);
        info.setText(cityArrayList.get(position).getDetails());

        return listView_inflate;
    }
}
