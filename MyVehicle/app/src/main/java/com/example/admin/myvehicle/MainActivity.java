package com.example.admin.myvehicle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    public void activity2(View view)
    {
        Intent intent = new Intent(this,List.class);
        startActivity(intent);
    }
    public void activity1(View view)
    {
        Intent intent = new Intent(this,List.class);
        startActivity(intent);
    }
}
