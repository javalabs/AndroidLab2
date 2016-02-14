package com.github.javalabs.androidlab2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "RelativeLayout", Toast.LENGTH_SHORT).show();
    }

    public void onClickBtn1(View v) {
        switch(v.getId()) {
            case R.id.btn_relative: {
                Toast.makeText(this, "Это и есть RelativeLayout", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn_linear: {
                Intent intent = new Intent(this, LinearActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_table: {
                Intent intent = new Intent(this, TableActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_frame: {
                Intent intent = new Intent(this, FrameActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn1:
            case R.id.btn2:
            case R.id.btn3:
            case R.id.btn4: {
                Toast.makeText(this, "Вы нажали на: " + ((Button)v).getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            }

        }
    }
}
