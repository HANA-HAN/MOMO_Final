package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RandMatchingActivity extends AppCompatActivity {

    Button backtochatlist, rand_leftBtn, rand_RightBtn, rand_requestBtn;
    ImageView rand_interest_image;
    TextView rand_nickname, rand_introduce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randmatching);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        backtochatlist = (Button)findViewById(R.id.backtochatlist);
        rand_leftBtn = (Button)findViewById(R.id.rand_leftBtn);
        rand_RightBtn = (Button)findViewById(R.id.rand_RightBtn);
        rand_requestBtn = (Button)findViewById(R.id.rand_requestBtn);
        rand_interest_image = (ImageView) findViewById(R.id.rand_interest_image);
        rand_nickname = (TextView) findViewById(R.id.rand_nickname);
        rand_introduce = (TextView) findViewById(R.id.rand_introduce);
        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.rand_leftBtn:
                        rand_interest_image.setImageResource(R.drawable.icon_fashion);
                        rand_nickname.setText("나이키만세");
                        rand_introduce.setText("나이키 브랜드에 관심이 많아요.\n스타일러를 알아보고 있어요.");
                        break;
                    case R.id.rand_RightBtn:
                        rand_interest_image.setImageResource(R.drawable.icon_makeup);
                        rand_nickname.setText("MakeM");
                        rand_introduce.setText("메이크업 픽서에 관심있어요.");
                        break;
                    case R.id.rand_requestBtn:
                        Toast t = Toast.makeText(RandMatchingActivity.this, "채팅 요청을 보냈어요.", Toast.LENGTH_SHORT);
                        t.show();
                        break;
                    case R.id.backtochatlist:
                        Intent i = new Intent(RandMatchingActivity.this, ChatlistActivity.class);
                        startActivity(i);
                        finish();
                        break;
                }
            }
        };
        rand_leftBtn.setOnClickListener(onClickListener);
        rand_RightBtn.setOnClickListener(onClickListener);
        rand_requestBtn.setOnClickListener(onClickListener);
        backtochatlist.setOnClickListener(onClickListener);
    }
}