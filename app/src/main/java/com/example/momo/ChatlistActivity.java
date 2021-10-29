package com.example.momo;

import static com.example.momo.ChatroomActivity.chatroom_name;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatlistActivity extends AppCompatActivity {

    Button randBtn, requestBtn, backtomain;
    LinearLayout chatlist0,chatlist1,chatlist2,chatlist3,chatlist4;
    TextView chatlist_Linear0_nickname, chatlist_Linear1_nickname, chatlist_Linear2_nickname, chatlist_Linear3_nickname, chatlist_Linear4_nickname, chatlist_Linear1_textL, chatlist_Linear2_textL, chatlist_Linear3_textL, chatlist_Linear4_textL;

    //상대의 이름 전역변수로 저장
    public static String opposite_name = "";

    /* public String chatlist_Linear1_nickname="";
    public String chatlist_Linear2_nickname="";
    public String chatlist_Linear3_nickname="";
    public String chatlist_Linear4_nickname="";
    public String chatlist_Linear1_text="";
    public String chatlist_Linear2_text="";
    public String chatlist_Linear3_text="";
    public String chatlist_Linear4_text=""; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatlist);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        //친구 요청 목록에서 들어오는 인텐트가 실제 받아들이는 부분에 있어서 미리 선언이 안된 즉, 이전 인텐트인 chatlist에서 받는다고 선언해놓아서 에러 발생
        //따라서 이 부분은 DB에서 저장된 정보를 가져와서 띄워야함
        //그리고 아래 쪽도 역시 똑같음.
        //채팅방으로 입장시 해장 내용들을 위에 닉네임 등을 띄우려면 DB에서 가져온 내용들이 미리 세팅이 되어있어야 함.
        /*Intent getfromRequest = getIntent();
        Linear1_nickname = getfromRequest.getExtras().getString("Linear1_nickname");
        Linear2_nickname = getfromRequest.getExtras().getString("Linear2_nickname");
        Linear3_nickname = getfromRequest.getExtras().getString("Linear3_nickname");
        Linear4_nickname = getfromRequest.getExtras().getString("Linear4_nickname");
        Linear1_text = getfromRequest.getExtras().getString("Linear1_text");
        Linear2_text = getfromRequest.getExtras().getString("Linear2_text");
        Linear3_text = getfromRequest.getExtras().getString("Linear3_text");
        Linear4_text = getfromRequest.getExtras().getString("Linear4_text");*/

        randBtn = (Button)findViewById(R.id.randBtn);
        requestBtn = (Button)findViewById(R.id.requestBtn);
        backtomain = (Button)findViewById(R.id.backtomain);
        chatlist0 = (LinearLayout)findViewById(R.id.chatlist0);
        chatlist1 = (LinearLayout)findViewById(R.id.chatlist1);
        chatlist2 = (LinearLayout)findViewById(R.id.chatlist2);
        chatlist3 = (LinearLayout)findViewById(R.id.chatlist3);
        chatlist4 = (LinearLayout)findViewById(R.id.chatlist4);

        chatlist_Linear0_nickname = (TextView)findViewById(R.id.chatlist_Linear0_nickname);
        chatlist_Linear1_nickname = (TextView)findViewById(R.id.chatlist_Linear1_nickname);
        chatlist_Linear2_nickname = (TextView)findViewById(R.id.chatlist_Linear2_nickname);
        chatlist_Linear3_nickname = (TextView)findViewById(R.id.chatlist_Linear3_nickname);
        chatlist_Linear4_nickname = (TextView)findViewById(R.id.chatlist_Linear4_nickname);
        chatlist_Linear1_textL = (TextView)findViewById(R.id.chatlist_Linear1_textL);
        chatlist_Linear2_textL = (TextView)findViewById(R.id.chatlist_Linear2_textL);
        chatlist_Linear3_textL = (TextView)findViewById(R.id.chatlist_Linear3_textL);
        chatlist_Linear4_textL = (TextView)findViewById(R.id.chatlist_Linear4_textL);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.randBtn:
                        Intent a = new Intent(ChatlistActivity.this, RandMatchingActivity.class);
                        startActivity(a);
                        break;
                    case R.id.requestBtn:
                        Intent b = new Intent(ChatlistActivity.this, FriendRequestlistActivity.class);
                        startActivity(b);
                        break;
                    case R.id.backtomain:
                        Intent c = new Intent(ChatlistActivity.this, MainActivity.class);
                        startActivity(c);
                        break;
                    //이 아래부터 각 리스트 누르면 전역변수인 상대방 이름(opposite_name)으로 설정
                    case R.id.chatlist0:
                        Intent d = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        opposite_name = chatlist_Linear0_nickname.getText().toString();
                        chatroom_name = opposite_name;
                        startActivity(d);
                        break;
                    case R.id.chatlist1:
                        Intent e = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        opposite_name = chatlist_Linear1_nickname.getText().toString();
                        chatroom_name = opposite_name;
                        startActivity(e);
                        break;
                    /*case R.id.chatlist2:
                        Intent f = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        //f.putExtra("Linear2_nickname", Linear2_nickname);
                        //f.putExtra("Linear2_text", Linear2_text);
                        startActivity(f);
                        finish();
                        break;
                    case R.id.chatlist3:
                        Intent g = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        //g.putExtra("Linear3_nickname", Linear3_nickname);
                        //g.putExtra("Linear3_text", Linear3_text);
                        startActivity(g);
                        finish();
                        break;
                    case R.id.chatlist4:
                        Intent h = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        //h.putExtra("Linear4_nickname", Linear4_nickname);
                        //h.putExtra("Linear4_text", Linear4_text);
                        startActivity(h);
                        finish();
                        break;*/
                }
            }
        };

        randBtn.setOnClickListener(onClickListener);
        requestBtn.setOnClickListener(onClickListener);
        backtomain.setOnClickListener(onClickListener);
        chatlist0.setOnClickListener(onClickListener);
        chatlist1.setOnClickListener(onClickListener);
        /*chatlist2.setOnClickListener(onClickListener);
        chatlist3.setOnClickListener(onClickListener);
        chatlist4.setOnClickListener(onClickListener);*/
    }
}