package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class UserinfoActivity extends AppCompatActivity {

    Button userinfo_cancleBtn, userinfo_reportBtn;
    ImageView userinfo_userInterestimg;
    TextView userinfo_userNickname, userinfo_interest_line, userinfo_introduce_line;
    public static String userinfo_name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userinfo);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        userinfo_cancleBtn = (Button)findViewById(R.id.userinfo_cancleBtn);
        userinfo_reportBtn = (Button)findViewById(R.id.userinfo_reportBtn);
        userinfo_userInterestimg = (ImageView) findViewById(R.id.userinfo_userInterestimg);
        userinfo_userNickname = (TextView)findViewById(R.id.userinfo_userNickname);
        userinfo_interest_line = (TextView)findViewById(R.id.userinfo_interest_line);
        userinfo_introduce_line = (TextView)findViewById(R.id.userinfo_introduce_line);

        Intent intent = getIntent();
        userinfo_name = intent.getExtras().getString("chatroom_name");
        userinfo_userNickname.setText(userinfo_name);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    //클릭한 이미지에 따라 이름 전달 -> 받는 인텐트에서 이름을 기준으로 사진 연동
                    case R.id.userinfo_cancleBtn:
                        Intent a = new Intent(UserinfoActivity.this, ChatroomActivity.class);
                        startActivity(a);
                        break;
                    case R.id.userinfo_reportBtn:
                        Intent b = new Intent(UserinfoActivity.this, ReportActivity.class);
                        startActivity(b);
                        break;
                }
            }
        };

        userinfo_cancleBtn.setOnClickListener(onClickListener);
        userinfo_reportBtn.setOnClickListener(onClickListener);
    }
}
