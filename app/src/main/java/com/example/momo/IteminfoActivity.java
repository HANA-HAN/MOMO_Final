package com.example.momo;

import static com.example.momo.ChatroomActivity.chatroom_name;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IteminfoActivity extends AppCompatActivity {
    Button backtoitemlist2, iteminfo_gotochatroom;
    TextView iteminfo_sellerName;
    public static String sellerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteminfo);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
        iteminfo_sellerName = (TextView)findViewById(R.id.iteminfo_sellerName);
        sellerName = iteminfo_sellerName.getText().toString();

        backtoitemlist2 = (Button)findViewById(R.id.backtoitemlist2);
        backtoitemlist2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(IteminfoActivity.this, UsedtradeActivity.class);
                startActivity(a);
                finish();
            }
        });

        iteminfo_gotochatroom = (Button)findViewById(R.id.iteminfo_gotochatroom);
        iteminfo_gotochatroom.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(IteminfoActivity.this, ChatroomActivity.class);
                //채팅방의 이름을 설정해야하기 때문에~~
                chatroom_name = sellerName;
                startActivity(b);
                finish();
            }
        });
    }
}