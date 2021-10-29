package com.example.momo;

import static com.example.momo.InterestActivity.myInterestname;
import static com.example.momo.ProfileActivity.myIntroduce;
import static com.example.momo.ProfileActivity.myNickname;

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

//    이부분이 있으면 쳇리스트에서 메인으로 들어왔을때 멈추게됨 -> 리니어로 다시 해야할듯
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
                Intent g = new Intent(MainActivity.this, WithdrawalActivity.class);
                startActivity(g);
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

        main_nickname_line = (TextView)findViewById(R.id.main_nickname_line);
        main_interest_line = (TextView)findViewById(R.id.main_interest_line);
        main_introduce_line = (TextView)findViewById(R.id.main_introduce_line);
        main_nickname_line.setText(myNickname);
        main_interest_line.setText(myInterestname);
        main_introduce_line.setText(myIntroduce);

        myinterest_image = (ImageView) findViewById(R.id.myinterest_image);
        switch (myInterestname) {
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

            case "보드게임":
                myinterest_image.setImageResource(R.drawable.icon_boardgame);
                break;
            case "자동차":
                myinterest_image.setImageResource(R.drawable.icon_car);
                break;
            case "카페":
                myinterest_image.setImageResource(R.drawable.icon_cafe);
                break;
            case "드로잉":
                myinterest_image.setImageResource(R.drawable.icon_drawing);
                break;
            case "축구":
                myinterest_image.setImageResource(R.drawable.icon_soccer);
                break;
            case "영화":
                myinterest_image.setImageResource(R.drawable.icon_movie);
                break;

            case "반려동물":
                myinterest_image.setImageResource(R.drawable.icon_pet);
                break;
            case "서핑":
                myinterest_image.setImageResource(R.drawable.icon_surfing);
                break;
            case "낚시":
                myinterest_image.setImageResource(R.drawable.icon_fishing);
                break;
            case "주식":
                myinterest_image.setImageResource(R.drawable.icon_stock);
                break;
            case "TV":
                myinterest_image.setImageResource(R.drawable.icon_tv);
                break;
            case "보":
                myinterest_image.setImageResource(R.drawable.icon_vocal);
                break;

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

            case "비트코인":
                myinterest_image.setImageResource(R.drawable.icon_bitcoin);
                break;
            case "수영":
                myinterest_image.setImageResource(R.drawable.icon_swim);
                break;
            case "영어":
                myinterest_image.setImageResource(R.drawable.icon_english);
                break;
            case "공부":
                myinterest_image.setImageResource(R.drawable.icon_study);
                break;
            case "드라이브":
                myinterest_image.setImageResource(R.drawable.icon_drive);
                break;
            case "프로그래밍":
                myinterest_image.setImageResource(R.drawable.icon_programming);
                break;

            case "가구":
                myinterest_image.setImageResource(R.drawable.icon_furniture);
                break;
            case "문신":
                myinterest_image.setImageResource(R.drawable.icon_tattoo);
                break;
            case "연예인":
                myinterest_image.setImageResource(R.drawable.icon_celebrity);
                break;
            case "골프":
                myinterest_image.setImageResource(R.drawable.icon_golf);
                break;
            case "향수":
                myinterest_image.setImageResource(R.drawable.icon_perfume);
                break;
            case "스타일링":
                myinterest_image.setImageResource(R.drawable.icon_styling);
                break;
        }

        tousedtrade = (Button) findViewById(R.id.tousedtrade);
        tomain = (Button) findViewById(R.id.tomain);
        tochat = (Button) findViewById(R.id.tochat);
        main_edit_interest = (Button) findViewById(R.id.main_edit_interest);
        main_edit_introduce = (Button) findViewById(R.id.main_edit_introduce);

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