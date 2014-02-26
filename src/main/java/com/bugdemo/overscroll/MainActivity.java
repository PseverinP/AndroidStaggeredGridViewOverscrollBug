package com.bugdemo.overscroll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.etsy.android.grid.StaggeredGridView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Overscroll bug demo");
        setContentView(R.layout.activity_main);

        StaggeredGridView gridView = (StaggeredGridView)findViewById(R.id.grid_view);
        gridView.setAdapter(new SampleAdapter(this));
    }

}
