package com.example.android1.listviewscrolloffon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Android1 on 7/27/2017.
 */

public class ListAdapter extends BaseAdapter {

    ArrayList<ListItem> listItems = new ArrayList<>();

    ListAdapter(ArrayList<ListItem> listItems) {
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitemlayout,parent,false);

        TextView data=(TextView) convertView.findViewById(R.id.data);
        TextView input=(TextView) convertView.findViewById(R.id.input);

        data.setText(listItems.get(position).getData());
        input.setText(listItems.get(position).getInput());

        return convertView;
    }
}
