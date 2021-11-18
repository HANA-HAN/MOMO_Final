package com.example.momo;

import static com.example.momo.InterestActivity.myInterestname;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UsedtradeActivity extends AppCompatActivity {
    LinearLayout toiteminfo_1, toiteminfo_2, toiteminfo_3;
    Button registerBtn, backtomain2;
    View toiteminfo_1_line, toiteminfo_2_line, toiteminfo_3_line;

    public static String itemregisterFlag = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usedtrade);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
        toiteminfo_1 = (LinearLayout)findViewById(R.id.toiteminfo_1);
        toiteminfo_2 = (LinearLayout)findViewById(R.id.toiteminfo_2);
        toiteminfo_3 = (LinearLayout)findViewById(R.id.toiteminfo_3);
        toiteminfo_1_line = (View)findViewById(R.id.toiteminfo_1_line);
        toiteminfo_2_line = (View)findViewById(R.id.toiteminfo_2_line);
        toiteminfo_3_line = (View)findViewById(R.id.toiteminfo_3_line);


        switch(myInterestname){
            case "패션":
                toiteminfo_1.setVisibility(toiteminfo_1.VISIBLE);
                toiteminfo_1_line.setVisibility(toiteminfo_1_line.VISIBLE);
                if (itemregisterFlag == "true"){
                    toiteminfo_2.setVisibility(toiteminfo_2.GONE);
                    toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
                } else{
                    toiteminfo_2.setVisibility(toiteminfo_2.GONE);
                    toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
                }
                break;
            case "메이크업":
                toiteminfo_1.setVisibility(toiteminfo_1.GONE);
                toiteminfo_1_line.setVisibility(toiteminfo_1_line.GONE);
                toiteminfo_2.setVisibility(toiteminfo_2.GONE);
                toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
                toiteminfo_3.setVisibility(toiteminfo_3.VISIBLE);
                toiteminfo_3_line.setVisibility(toiteminfo_3_line.VISIBLE);
                break;
            default:
                toiteminfo_1.setVisibility(toiteminfo_1.GONE);
                toiteminfo_1_line.setVisibility(toiteminfo_1_line.GONE);
                toiteminfo_2.setVisibility(toiteminfo_2.GONE);
                toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
                toiteminfo_3.setVisibility(toiteminfo_3.GONE);
                toiteminfo_3_line.setVisibility(toiteminfo_3_line.GONE);
                break;
        }

//        if(myInterestname == "패션"){
//            toiteminfo_1.setVisibility(toiteminfo_1.VISIBLE);
//            toiteminfo_1_line.setVisibility(toiteminfo_1_line.VISIBLE);
//            toiteminfo_2.setVisibility(toiteminfo_2.GONE);
//            toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
//        }
//        if(myInterestname == "메이크업"){
//            toiteminfo_1.setVisibility(toiteminfo_1.GONE);
//            toiteminfo_1_line.setVisibility(toiteminfo_1_line.GONE);
//            toiteminfo_2.setVisibility(toiteminfo_2.GONE);
//            toiteminfo_2_line.setVisibility(toiteminfo_2_line.GONE);
//            toiteminfo_3.setVisibility(toiteminfo_3.VISIBLE);
//            toiteminfo_3_line.setVisibility(toiteminfo_3_line.VISIBLE);
//        }

        registerBtn = (Button)findViewById(R.id.registerBtn);
        backtomain2 = (Button)findViewById(R.id.backtomain2);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.toiteminfo_1:
                        Intent a = new Intent(UsedtradeActivity.this, IteminfoActivity.class);
                        startActivity(a);
                        break;
                    case R.id.toiteminfo_2:
                        Intent aa = new Intent(UsedtradeActivity.this, IteminfoActivity2.class);
                        startActivity(aa);
                        break;
                    case R.id.toiteminfo_3:
                        Intent aaa = new Intent(UsedtradeActivity.this, IteminfoActivity3.class);
                        startActivity(aaa);
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

        toiteminfo_1.setOnClickListener(onClickListener);
        toiteminfo_2.setOnClickListener(onClickListener);
        toiteminfo_3.setOnClickListener(onClickListener);
        registerBtn.setOnClickListener(onClickListener);
        backtomain2.setOnClickListener(onClickListener);
    }
}