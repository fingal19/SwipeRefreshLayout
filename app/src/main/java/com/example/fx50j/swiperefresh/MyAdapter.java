package com.example.fx50j.swiperefresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FX50J on 2016/3/23.
 */
public class MyAdapter extends ArrayAdapter {
    List<Data> list;
    Context mcontext;

    public MyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.list = objects;
    }


    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(mcontext).inflate(R.layout.list_item,parent,false);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        Data data = list.get(position);
        tv.setText(data.getData());

        return view;
    }
}
