package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tousedtrade, tomain, tochat, main_edit_interest, main_edit_introduce;
    TextView main_nickname_line, main_interest_line, main_introduce_line;
    ImageView myinterest_image;
    String nickName = ""; //닉네임
    String introduce = ""; //소개글
    String cur_name = ""; //관심사 이름

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_actionbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                Toast t1 = Toast.makeText(this, "로그아웃", Toast.LENGTH_SHORT);
                t1.show();
//                Intent f = new Intent(MainActivity.this, CustomerAuthActivity.class);
//                startActivity(f);
                break;
            case R.id.action_withdrawal:
                Toast t2 = Toast.makeText(this, "회원탈퇴", Toast.LENGTH_SHORT);
                t2.show();
//                Intent g = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(g);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        tousedtrade = (Button) findViewById(R.id.tousedtrade);
        tomain = (Button) findViewById(R.id.tomain);
        tochat = (Button) findViewById(R.id.tochat);
        main_edit_interest = (Button) findViewById(R.id.main_edit_interest);
        main_edit_introduce = (Button) findViewById(R.id.main_edit_introduce);
        main_nickname_line = (TextView) findViewById(R.id.main_nickname_line);
        main_interest_line = (TextView) findViewById(R.id.main_interest_line);
        main_introduce_line = (TextView) findViewById(R.id.main_introduce_line);
        myinterest_image = (ImageView) findViewById(R.id.myinterest_image);

        Intent getfromInterest = getIntent();
        cur_name = getfromInterest.getExtras().getString("interest_name");
        Intent getfromProfile = getIntent();
        nickName = getfromProfile.getExtras().getString("nickname");
        introduce = getfromProfile.getExtras().getString("introduce");
        main_nickname_line.setText(nickName);
        main_interest_line.setText(cur_name);
        main_introduce_line.setText(introduce);
        switch (cur_name) {
            case "사진/영상":
                myinterest_image.setImageResource(R.drawable.icon_camera);
                break;
            case "패션":
                myinterest_image.setImageResource(R.drawable.icon_fashion);
                break;
            case "메이크업":
                myinterest_image.setImageResource(R.drawable.icon_makeup);
                break;
            case "댄스":
                myinterest_image.setImageResource(R.drawable.icon_dance);
                break;
            case "요리":
                myinterest_image.setImageResource(R.drawable.icon_food);
                break;
            case "여행":
                myinterest_image.setImageResource(R.drawable.icon_travel);
                break;
            case "헬스":
                myinterest_image.setImageResource(R.drawable.icon_health);
                break;
            case "캠핑":
                myinterest_image.setImageResource(R.drawable.icon_camp);
                break;
            case "게임":
                myinterest_image.setImageResource(R.drawable.icon_game);
                break;
            case "책":
                myinterest_image.setImageResource(R.drawable.icon_book);
                break;
            case "음악":
                myinterest_image.setImageResource(R.drawable.icon_music);
                break;
            case "음주":
                myinterest_image.setImageResource(R.drawable.icon_drink);
                break;
        }

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tousedtrade:
                        Intent a = new Intent(MainActivity.this, UsedtradeActivity.class);
                        startActivity(a);
                        break;
                    //finish();
                    case R.id.tomain:
                        Intent b = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(b);
                        break;
                    //finish();
                    case R.id.tochat:
                        Intent c = new Intent(MainActivity.this, ChatlistActivity.class);
                        startActivity(c);
                        break;
                    //finish();
                    case R.id.main_edit_interest:
                        Intent d = new Intent(MainActivity.this, InterestActivity.class);
                        startActivity(d);
                        break;
                    //finish();
                    case R.id.main_edit_introduce:
                        Intent e = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(e);
                        break;
                    //finish();
                }
            }
        };
        tousedtrade.setOnClickListener(onClickListener);
        tomain.setOnClickListener(onClickListener);
        tochat.setOnClickListener(onClickListener);
        main_edit_interest.setOnClickListener(onClickListener);
        main_edit_introduce.setOnClickListener(onClickListener);
    }
}