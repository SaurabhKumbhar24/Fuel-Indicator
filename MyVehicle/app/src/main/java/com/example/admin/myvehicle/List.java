package com.example.admin.myvehicle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    public void m(View view)
    {
        Intent intent = new Intent(this,Milege.class);
        startActivity(intent);
    }
    public void v(View view)
    {
        Intent intent = new Intent(this,volume.class);
        startActivity(intent);
    }
    public void d(View view)
    {
        Intent intent = new Intent(this,Distance.class);
        startActivity(intent);
    }
    public void s(View view)
    {
        Intent intent = new Intent(this,speed.class);
        startActivity(intent);
    }
    public void l(View view)
    {
        Intent intent = new Intent(this,locate.class);
        startActivity(intent);
    }
    public void wl(View view)
    {
        Intent intent = new Intent(this,WaterLevel.class);
        startActivity(intent);
    }
    public void h(View view)
    {
        Intent intent = new Intent(this,history.class);
        startActivity(intent);
    }

}
