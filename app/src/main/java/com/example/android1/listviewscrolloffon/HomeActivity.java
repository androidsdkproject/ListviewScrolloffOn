package com.example.android1.listviewscrolloffon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ListItem> arrayList = new ArrayList<>();

    Button start, stop;

    String TAG = "Home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = (ListView) findViewById(R.id.listview);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        for (int i = 0; i <= 300; i++)
            arrayList.add(new ListItem("Data " + i, "input " + i));


        ListAdapter adapter = new ListAdapter(arrayList);
        listView.clearAnimation();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "start");
                listView.setEnabled(false);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "stop");
                listView.setEnabled(true);
            }
        });
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
