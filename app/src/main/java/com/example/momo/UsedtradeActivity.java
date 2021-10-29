package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

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
        registerBtn = (Button)findViewById(R.id.registerBtn);
        backtomain2 = (Button)findViewById(R.id.backtomain2);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.toiteminfo:
                        Intent a = new Intent(UsedtradeActivity.this, IteminfoActivity.class);
                        startActivity(a);
                        break;
                    case R.id.registerBtn:
                        Intent b = new Intent(UsedtradeActivity.this, ItemregisterActivity.class);
                        startActivity(b);
                        break;
                    case R.id.backtomain2:
                        Intent c = new Intent(UsedtradeActivity.this, MainActivity.class);
                        startActivity(c);
                        break;
                }
            }
        };
        toiteminfo.setOnClickListener(onClickListener);
        registerBtn.setOnClickListener(onClickListener);
        backtomain2.setOnClickListener(onClickListener);
    }
}