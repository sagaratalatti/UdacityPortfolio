package com.android.udacityportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.popular_button:
                Toast.makeText(MainActivity.this,"Launching Popular Movies :)",Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_hawk_button:
                Toast.makeText(MainActivity.this,"Launching Stock Hawk :)",Toast.LENGTH_SHORT).show();
                break;

            case R.id.build_it_bigger_button:
                Toast.makeText(MainActivity.this,"Launching Build it Bigger :)",Toast.LENGTH_SHORT).show();
                break;

            case R.id.make_your_app_material_button:
                Toast.makeText(MainActivity.this,"Launching Make Your App Material :)",Toast.LENGTH_SHORT).show();
                break;

            case R.id.go_ubiquitous_button:
                Toast.makeText(MainActivity.this,"Launching Go Ubiquitous :)",Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone_button:
                Toast.makeText(MainActivity.this,"Launching Capstone :)",Toast.LENGTH_SHORT).show();

        }
    }
}
