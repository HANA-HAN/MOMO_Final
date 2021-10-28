package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FriendRequestlistActivity extends AppCompatActivity {

    Button backtochatlistBtn;
    Button accept_btn1, accept_btn2, accept_btn3, accept_btn4, reject_btn1, reject_btn2, reject_btn3, reject_btn4;
    LinearLayout request_Linear1,request_Linear2,request_Linear3,request_Linear4;
    ImageView request_Linear1_interest_image,request_Linear2_interest_image,request_Linear3_interest_image,request_Linear4_interest_image;
    TextView request_Linear1_textL,request_Linear2_textL,request_Linear3_textL, request_Linear4_textL, request_Linear1_nickname,request_Linear2_nickname,request_Linear3_nickname,request_Linear4_nickname;

    String Linear1_nickname="";
    String Linear2_nickname="";
    String Linear3_nickname="";
    String Linear4_nickname="";
    String Linear1_text="";
    String Linear2_text="";
    String Linear3_text="";
    String Linear4_text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendrequestlist);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
        backtochatlistBtn = (Button)findViewById(R.id.backtochatlistBtn);
        accept_btn1 = (Button)findViewById(R.id.accept_btn1);
        accept_btn2 = (Button)findViewById(R.id.accept_btn2);
        accept_btn3 = (Button)findViewById(R.id.accept_btn3);
        accept_btn4 = (Button)findViewById(R.id.accept_btn4);
        reject_btn1 = (Button)findViewById(R.id.reject_btn1);
        reject_btn2 = (Button)findViewById(R.id.reject_btn2);
        reject_btn3 = (Button)findViewById(R.id.reject_btn3);
        reject_btn4 = (Button)findViewById(R.id.reject_btn4);
        request_Linear1 = (LinearLayout)findViewById(R.id.request_Linear1);
        request_Linear2 = (LinearLayout)findViewById(R.id.request_Linear2);
        request_Linear3 = (LinearLayout)findViewById(R.id.request_Linear3);
        request_Linear4 = (LinearLayout)findViewById(R.id.request_Linear4);
        request_Linear1_interest_image = (ImageView)findViewById(R.id.request_Linear1_interest_image);
        request_Linear2_interest_image = (ImageView)findViewById(R.id.request_Linear2_interest_image);
        request_Linear3_interest_image = (ImageView)findViewById(R.id.request_Linear3_interest_image);
        request_Linear4_interest_image = (ImageView)findViewById(R.id.request_Linear4_interest_image);
        request_Linear1_textL = (TextView)findViewById(R.id.request_Linear1_textL);
        request_Linear2_textL = (TextView)findViewById(R.id.request_Linear2_textL);
        request_Linear3_textL = (TextView)findViewById(R.id.request_Linear3_textL);
        request_Linear4_textL = (TextView)findViewById(R.id.request_Linear4_textL);
        request_Linear1_nickname = (TextView)findViewById(R.id.request_Linear1_nickname);
        request_Linear2_nickname = (TextView)findViewById(R.id.request_Linear2_nickname);
        request_Linear3_nickname = (TextView)findViewById(R.id.request_Linear3_nickname);
        request_Linear4_nickname = (TextView)findViewById(R.id.request_Linear4_nickname);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.accept_btn1:
                        Toast t = Toast.makeText(FriendRequestlistActivity.this, "수락!", Toast.LENGTH_SHORT);
                        t.show();
                        request_Linear1_textL.setBackgroundResource(R.drawable.tnfkr);
                        Linear1_nickname = request_Linear1_nickname.getText().toString();
                        Linear1_text = request_Linear1_textL.getText().toString();
                        break;
                    case R.id.accept_btn2:
                        request_Linear2_textL.setBackgroundResource(R.drawable.tnfkr);
                        Linear2_nickname = request_Linear2_nickname.getText().toString();
                        Linear2_text = request_Linear2_textL.getText().toString();
                        break;
                    case R.id.accept_btn3:
                        request_Linear3_textL.setBackgroundResource(R.drawable.tnfkr);
                        Linear3_nickname = request_Linear3_nickname.getText().toString();
                        Linear3_text = request_Linear3_textL.getText().toString();
                        break;
                    case R.id.accept_btn4:
                        request_Linear4_textL.setBackgroundResource(R.drawable.tnfkr);
                        Linear4_nickname = request_Linear4_nickname.getText().toString();
                        Linear4_text = request_Linear4_textL.getText().toString();
                        break;
                    case R.id.reject_btn1:
                        request_Linear1_textL.setBackgroundResource(R.drawable.rjwjf);
                        break;
                    case R.id.reject_btn2:
                        request_Linear2_textL.setBackgroundResource(R.drawable.rjwjf);
                        break;
                    case R.id.reject_btn3:
                        request_Linear3_textL.setBackgroundResource(R.drawable.rjwjf);
                        break;
                    case R.id.reject_btn4:
                        request_Linear4_textL.setBackgroundResource(R.drawable.rjwjf);
                        break;
                    case R.id.backtochatlistBtn:
                        request_Linear1.setVisibility(View.GONE);
                        request_Linear2.setVisibility(View.GONE);
                        request_Linear3.setVisibility(View.GONE);
                        request_Linear4.setVisibility(View.GONE);
                        Intent a = new Intent(FriendRequestlistActivity.this, ChatlistActivity.class);
                        a.putExtra("Linear1_nickname", Linear1_nickname);
                        a.putExtra("Linear2_nickname", Linear2_nickname);
                        a.putExtra("Linear3_nickname", Linear3_nickname);
                        a.putExtra("Linear4_nickname", Linear4_nickname);
                        a.putExtra("Linear1_text", Linear1_text);
                        a.putExtra("Linear2_text", Linear2_text);
                        a.putExtra("Linear3_text", Linear3_text);
                        a.putExtra("Linear4_text", Linear4_text);
                        startActivity(a);
                        finish();
                }
            }
        };

        backtochatlistBtn.setOnClickListener(onClickListener);
        accept_btn1.setOnClickListener(onClickListener);
        accept_btn2.setOnClickListener(onClickListener);
        accept_btn3.setOnClickListener(onClickListener);
        accept_btn4.setOnClickListener(onClickListener);
        reject_btn1.setOnClickListener(onClickListener);
        reject_btn2.setOnClickListener(onClickListener);
        reject_btn3.setOnClickListener(onClickListener);
        reject_btn4.setOnClickListener(onClickListener);

    }
}