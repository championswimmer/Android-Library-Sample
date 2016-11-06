package com.codingblocks.libraryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codingblocks.mylibrary.DateUtils;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date d = DateUtils.string2date("Somestring");
    }
}
