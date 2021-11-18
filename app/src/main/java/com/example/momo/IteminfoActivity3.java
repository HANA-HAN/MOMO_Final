package com.example.momo;

import static com.example.momo.ChatlistActivity.chatlist1Flag;
import static com.example.momo.ChatlistActivity.chatlist2Flag;
import static com.example.momo.ChatroomActivity.chatroom_name;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IteminfoActivity3 extends AppCompatActivity {
    Button backtoitemlist4, iteminfo3_gotochatroom;
    TextView iteminfo3_sellerName;
    public static String sellerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteminfo3);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");
        iteminfo3_sellerName = (TextView)findViewById(R.id.iteminfo3_sellerName);
        sellerName = iteminfo3_sellerName.getText().toString();

        backtoitemlist4 = (Button)findViewById(R.id.backtoitemlist4);
        backtoitemlist4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(IteminfoActivity3.this, UsedtradeActivity.class);
                startActivity(a);
                finish();
            }
        });

        iteminfo3_gotochatroom = (Button)findViewById(R.id.iteminfo3_gotochatroom);
        iteminfo3_gotochatroom.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatlist2Flag = "true";
                Intent b = new Intent(IteminfoActivity3.this, ChatroomActivity.class);
                //채팅방의 이름을 설정해야하기 때문에~~
                chatroom_name = sellerName;
                chatlist1Flag = "true";
                startActivity(b);
                finish();
            }
        });
    }
}