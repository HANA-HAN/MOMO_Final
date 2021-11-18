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
    LinearLayout chatlist0,chatlist1,chatlist2;
    TextView chatlist_Linear0_nickname, chatlist_Linear0_textL, chatlist_Linear0_time, chatlist_Linear1_nickname, chatlist_Linear1_textL, chatlist_Linear1_time, chatlist_Linear2_nickname,chatlist_Linear2_textL,chatlist_Linear2_time;
    View chatlist0_line,chatlist1_line,chatlist2_line,chatlist3_line;


    public static String lastchatlogFlag1 = "false";
    public static String lastchatlogFlag2 = "false";
    public static String chatlist0Flag = "false";
    public static String chatlist1Flag = "false";
    public static String chatlist2Flag = "false";

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

        chatlist0_line = (View)findViewById(R.id.chatlist0_line);
        chatlist1_line = (View)findViewById(R.id.chatlist1_line);
        chatlist2_line = (View)findViewById(R.id.chatlist2_line);

        randBtn = (Button)findViewById(R.id.randBtn);
        requestBtn = (Button)findViewById(R.id.requestBtn);
        backtomain = (Button)findViewById(R.id.backtomain);
        chatlist0 = (LinearLayout)findViewById(R.id.chatlist0);
        chatlist1 = (LinearLayout)findViewById(R.id.chatlist1);
        chatlist2 = (LinearLayout)findViewById(R.id.chatlist2);
        chatlist_Linear0_nickname = (TextView)findViewById(R.id.chatlist_Linear0_nickname);
        chatlist_Linear0_textL = (TextView)findViewById(R.id.chatlist_Linear0_textL);
        if (lastchatlogFlag1 == "true"){
            chatlist_Linear0_textL.setText("네 안녕하세요.");
        } else{
            chatlist_Linear0_textL.setText("대화를 나눠보세요.");
        }
        chatlist_Linear0_time = (TextView)findViewById(R.id.chatlist_Linear0_time);
        chatlist_Linear1_nickname = (TextView)findViewById(R.id.chatlist_Linear1_nickname);
        chatlist_Linear1_textL = (TextView)findViewById(R.id.chatlist_Linear1_textL);
        chatlist_Linear1_time = (TextView)findViewById(R.id.chatlist_Linear1_time);
        if(lastchatlogFlag1 == "true"){
            chatlist_Linear1_textL.setText("안녕하세요 중고목록 보고 연락드려요.");
        } else{
            chatlist_Linear1_textL.setText("대화를 나눠보세요.");
        }

        if (chatlist0Flag == "true"){
            chatlist0_line.setVisibility(chatlist0_line.VISIBLE);
            chatlist0.setVisibility(chatlist0.VISIBLE);
        }else{
            chatlist0_line.setVisibility(chatlist0_line.GONE);
            chatlist0.setVisibility(chatlist0.GONE);
        }
        if (chatlist1Flag == "true"){
            chatlist1_line.setVisibility(chatlist1_line.VISIBLE);
            chatlist1.setVisibility(chatlist1.VISIBLE);
        }else{
            chatlist1_line.setVisibility(chatlist1_line.GONE);
            chatlist1.setVisibility(chatlist1.GONE);
        }
        chatlist_Linear2_nickname = (TextView)findViewById(R.id.chatlist_Linear2_nickname);
        chatlist_Linear2_textL = (TextView)findViewById(R.id.chatlist_Linear2_textL);
        chatlist_Linear2_time = (TextView)findViewById(R.id.chatlist_Linear2_time);
        if (chatlist2Flag == "true"){
            chatlist2_line.setVisibility(chatlist2_line.VISIBLE);
            chatlist2.setVisibility(chatlist2.VISIBLE);
        }else{
            chatlist2_line.setVisibility(chatlist2_line.GONE);
            chatlist2.setVisibility(chatlist2.GONE);
        }
        if (lastchatlogFlag1 == "true"){
            chatlist_Linear2_textL.setText("메이크업 박스 구매 원합니다!");
        } else{
            chatlist_Linear2_textL.setText("대화를 나눠보세요.");
        }


//        chatlist_Linear2_nickname = (TextView)findViewById(R.id.chatlist_Linear2_nickname);
//        chatlist_Linear2_textL = (TextView)findViewById(R.id.chatlist_Linear2_textL);
//        chatlist2 = (LinearLayout)findViewById(R.id.chatlist2);
//        chatlist3 = (LinearLayout)findViewById(R.id.chatlist3);
//        chatlist4 = (LinearLayout)findViewById(R.id.chatlist4);
//        chatlist_Linear3_nickname = (TextView)findViewById(R.id.chatlist_Linear3_nickname);
//        chatlist_Linear4_nickname = (TextView)findViewById(R.id.chatlist_Linear4_nickname);
//        chatlist_Linear3_textL = (TextView)findViewById(R.id.chatlist_Linear3_textL);
//        chatlist_Linear4_textL = (TextView)findViewById(R.id.chatlist_Linear4_textL);

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
                        opposite_name = chatlist_Linear0_nickname.getText().toString(); //위 아래 번갈아가면서!!!!
                        //opposite_name = "나이키맨"; //위와 번갈아 가면서!!!
                        chatroom_name = opposite_name;
                        startActivity(d);
                        break;
                    case R.id.chatlist1:
                        Intent e = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        opposite_name = chatlist_Linear1_nickname.getText().toString();
                        chatroom_name = opposite_name;
                        startActivity(e);
                        break;
                    case R.id.chatlist2:
                        Intent f = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                        opposite_name = chatlist_Linear2_nickname.getText().toString();
                        chatroom_name = opposite_name;
                        startActivity(f);
                        finish();
                        break;
                    /*case R.id.chatlist3:
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
        chatlist2.setOnClickListener(onClickListener);
        /*chatlist3.setOnClickListener(onClickListener);
        chatlist4.setOnClickListener(onClickListener);*/
    }
}