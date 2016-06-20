package com.shablcu.shalu.customlistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;

    int [] prgmImages={R.drawable.andrd,R.drawable.fb_0,R.drawable.google,R.drawable.javascrpt
            ,R.drawable.jsp,R.drawable.microsft,R.drawable.images,R.drawable.img};

    String[] prgmNameList={"Android","Facebook","Google","javaScript","jsp","microsoft","java","c"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lv=(ListView)findViewById(R.id.listView);

        lv.setAdapter(new CustomAdapter(this,prgmNameList,prgmImages));
    }
}
