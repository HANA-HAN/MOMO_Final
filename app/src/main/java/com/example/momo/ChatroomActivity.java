package com.example.momo;

import static com.example.momo.ChatlistActivity.opposite_name;
import static com.example.momo.IteminfoActivity.sellerName;
import static com.example.momo.ProfileActivity.myNickname;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatroomActivity extends AppCompatActivity {

    Button chatroom_backtochatlist, chatroom_userInfoBtn, Button_send;
    TextView chatroom_nickname;
    public static String chatroom_name="";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ChatData> chatList;

    // 중요!!!!!!! 사용자입장에서 일단 이 상태에서 실행한 다음 nick2로 바꾸고 에뮬레이터2번째꺼로 변경한 후 실행하면됨
    private String nick = myNickname;

    private EditText EditText_chat;

    public DatabaseReference myRef;

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

        EditText_chat = (EditText)findViewById(R.id.EditText_chat);
        Button_send = (Button)findViewById(R.id.Button_send);

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        chatList = new ArrayList<>();
        mAdapter = new ChatAdapter(chatList, ChatroomActivity.this, nick);

        mRecyclerView.setAdapter(mAdapter);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");

//        ChatData chat = new ChatData();
//        chat.setNickname(nick);
//        chat.setMsg("hi");
//        myRef.setValue(chat);

        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                ChatData chat = dataSnapshot.getValue(ChatData.class);
                ((ChatAdapter) mAdapter).addChat(chat);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        chatroom_backtochatlist = (Button)findViewById(R.id.chatroom_backtochatlist);
        chatroom_userInfoBtn = (Button)findViewById(R.id.chatroom_userInfoBtn);
        chatroom_nickname = (TextView)findViewById(R.id.chatroom_nickname);
        //상단바 상대방 닉네임 띄우기
        chatroom_nickname.setText(chatroom_name);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.Button_send:
                        String msg = EditText_chat.getText().toString();

                        if(msg != null){
                            ChatData chat = new ChatData();
                            chat.setNickname(nick);
                            chat.setMsg(msg);
                            myRef.push().setValue(chat);
                        }

                        EditText_chat.setText(null);
                        break;

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
        Button_send.setOnClickListener(onClickListener);
    }
}