package com.bugdemo.overscroll;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/***
 * ADAPTER
 */

public class SampleAdapter extends ArrayAdapter<ViewData> {

    private static final String TAG = "SampleAdapter";

    private static final ViewData[] mData = new ViewData[] {
            new ViewData(R.layout.view_a, "A"),
            new ViewData(R.layout.view_b, "B"),
            new ViewData(R.layout.view_c, "C")
    };

    private final LayoutInflater mLayoutInflater;


    public SampleAdapter(final Context context) {
        super(context, 0, mData);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        ViewData data = mData[position];
        TextView t = (TextView)mLayoutInflater.inflate(data.mResId, parent, false);
        t.setText(data.mTitle);
        return t;
    }

}