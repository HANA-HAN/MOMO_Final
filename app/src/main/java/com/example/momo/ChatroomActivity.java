package com.example.momo;

import static com.example.momo.ChatlistActivity.opposite_name;
import static com.example.momo.IteminfoActivity.sellerName;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatroomActivity extends AppCompatActivity {

    Button chatroom_backtochatlist, chatroom_userInfoBtn, sendBtn;
    TextView chatroom_nickname;
    public static String chatroom_name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatroom);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
//        Intent intent = getIntent();
//        namefromchatlist = intent.getExtras().getString("namefromchatlist");
//        임시설정
//        Intent intent = getIntent();
//        if (intent.getExtras().getString("namefromchatlist") == null){
//            namefromchatlist = "나이키만세";
//        }
//        else {
//            namefromchatlist = intent.getExtras().getString("namefromchatlist");
//        }

        sendBtn = (Button)findViewById(R.id.sendBtn);

        chatroom_backtochatlist = (Button)findViewById(R.id.chatroom_backtochatlist);
        chatroom_userInfoBtn = (Button)findViewById(R.id.chatroom_userInfoBtn);
        chatroom_nickname = (TextView)findViewById(R.id.chatroom_nickname);
        //상단바 상대방 닉네임 띄우기
        chatroom_nickname.setText(chatroom_name);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.chatroom_backtochatlist:
                        //아이템인포에서 왔으면 아이템인포로 돌아가야함
                        if(chatroom_nickname.getText().toString() == sellerName){
                            Intent a = new Intent(ChatroomActivity.this, IteminfoActivity.class);
                            startActivity(a);
                            finish();
                            break;
                        } else { //그가 아닌 경우에는 그냥 Chatlist로 돌아가기
                            Intent a2 = new Intent(ChatroomActivity.this, ChatlistActivity.class);
                            startActivity(a2);
                            finish();
                            break;
                        }
                    case R.id.chatroom_userInfoBtn:
                        Intent b = new Intent(ChatroomActivity.this, UserinfoActivity.class);
                        b.putExtra("chatroom_name",chatroom_nickname.getText().toString());
                        startActivity(b);
                        finish();
                        break;
                }
            }
        };
        chatroom_backtochatlist.setOnClickListener(onClickListener);
        chatroom_userInfoBtn.setOnClickListener(onClickListener);
    }
}