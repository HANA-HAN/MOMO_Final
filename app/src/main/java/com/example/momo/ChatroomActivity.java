package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatroomActivity extends AppCompatActivity {

    Button chatroom_backtochatlist;
    TextView chatroom_nickname;
    String namefromchatlist="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatroom);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
        Intent intent = getIntent();

        namefromchatlist = intent.getExtras().getString("namefromchatlist");
        chatroom_backtochatlist = (Button)findViewById(R.id.chatroom_backtochatlist);
        chatroom_nickname = (TextView)findViewById(R.id.chatroom_nickname);
        chatroom_nickname.setText(namefromchatlist);
        chatroom_backtochatlist.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ChatroomActivity.this, ChatlistActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}