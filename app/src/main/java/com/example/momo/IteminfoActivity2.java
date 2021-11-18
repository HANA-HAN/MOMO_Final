package com.example.momo;

import static com.example.momo.ChatlistActivity.chatlist1Flag;
import static com.example.momo.ChatroomActivity.chatroom_name;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IteminfoActivity2 extends AppCompatActivity {
    Button backtoitemlist3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iteminfo2);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        backtoitemlist3 = (Button)findViewById(R.id.backtoitemlist3);
        backtoitemlist3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(IteminfoActivity2.this, UsedtradeActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}