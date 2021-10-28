package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class UsedtradeActivity extends AppCompatActivity {
    LinearLayout toiteminfo;
    Button registerBtn, backtomain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usedtrade);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        toiteminfo = (LinearLayout)findViewById(R.id.toiteminfo);
        toiteminfo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(UsedtradeActivity.this, IteminfoActivity.class);
                startActivity(a);
                finish();
            }
        });

        registerBtn = (Button)findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(UsedtradeActivity.this, ItemregisterActivity.class);
                startActivity(b);
                finish();
            }
        });

        backtomain2 = (Button)findViewById(R.id.backtomain2);
        backtomain2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(UsedtradeActivity.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });
    }
}