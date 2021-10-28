package com.example.momo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class InterestActivity extends AppCompatActivity {
    Button interest_img_1_1, interest_img_1_2, interest_img_1_3, interest_img_2_1, interest_img_2_2, interest_img_2_3;
    TextView interest_text_1_1, interest_text_1_2, interest_text_1_3, interest_text_2_1, interest_text_2_2, interest_text_2_3;
    Button interest_leftBtn,interest_1Btn,interest_2Btn,interest_3Btn, interest_rightBtn, nextBtn, additionBtn;
    //int current_page_num = 1;
    String cur_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //id연동
        interest_img_1_1 = (Button)findViewById(R.id.interest_img_1_1);
        interest_img_1_2 = (Button)findViewById(R.id.interest_img_1_2);
        interest_img_1_3 = (Button)findViewById(R.id.interest_img_1_3);
        interest_img_2_1 = (Button)findViewById(R.id.interest_img_2_1);
        interest_img_2_2 = (Button)findViewById(R.id.interest_img_2_2);
        interest_img_2_3 = (Button)findViewById(R.id.interest_img_2_3);

        interest_text_1_1 = (TextView)findViewById(R.id.interest_text_1_1);
        interest_text_1_2 = (TextView)findViewById(R.id.interest_text_1_2);
        interest_text_1_3 = (TextView)findViewById(R.id.interest_text_1_3);
        interest_text_2_1 = (TextView)findViewById(R.id.interest_text_2_1);
        interest_text_2_2 = (TextView)findViewById(R.id.interest_text_2_2);
        interest_text_2_3 = (TextView)findViewById(R.id.interest_text_2_3);

        interest_leftBtn = (Button)findViewById(R.id.interest_leftBtn);
        interest_leftBtn.setBackgroundColor(Color.WHITE);
        interest_1Btn = (Button)findViewById(R.id.interest_1Btn);
        interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
        interest_2Btn = (Button)findViewById(R.id.interest_2Btn);
        interest_2Btn.setBackgroundColor(Color.WHITE);
        interest_3Btn = (Button)findViewById(R.id.interest_3Btn);
        interest_3Btn.setBackgroundColor(Color.WHITE);
        interest_rightBtn = (Button)findViewById(R.id.interest_rightBtn);
        interest_rightBtn.setBackgroundColor(Color.WHITE);
        nextBtn = (Button)findViewById(R.id.nextBtn);
        additionBtn = (Button)findViewById(R.id.additionBtn);


        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //클릭한 이미지에 따라 이름 전달 -> 받는 인텐트에서 이름을 기준으로 사진 연동
                    case R.id.interest_img_1_1:
                        cur_name = interest_text_1_1.getText().toString();
                        break;
                    case R.id.interest_img_1_2:
                        cur_name = interest_text_1_2.getText().toString();
                        break;
                    case R.id.interest_img_1_3:
                        cur_name = interest_text_1_3.getText().toString();
                        break;
                    case R.id.interest_img_2_1:
                        cur_name = interest_text_2_1.getText().toString();
                        break;
                    case R.id.interest_img_2_2:
                        cur_name = interest_text_2_2.getText().toString();
                        break;
                    case R.id.interest_img_2_3:
                        cur_name = interest_text_2_3.getText().toString();
                        break;

                    //왼쪽버튼
                    case R.id.interest_leftBtn :
                        switch(interest_1Btn.getText().toString()){
                            case "4":
                                //1번째 버튼의 텍스트가 4일 경우에는 <를 누르면 1,2,3으로 만들고 3이 선택되어야 함.
                                interest_1Btn.setText("1");
                                interest_2Btn.setText("2");
                                interest_3Btn.setText("3");
                                interest_1Btn.setBackgroundColor(Color.WHITE);
                                interest_2Btn.setBackgroundColor(Color.WHITE);
                                interest_3Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_pet);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_surfing);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_fishing);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_stock);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_tv);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_vocal);

                                interest_text_1_1.setText("반려동물");
                                interest_text_1_2.setText("서핑");
                                interest_text_1_3.setText("낚시");
                                interest_text_2_1.setText("주식");
                                interest_text_2_2.setText("TV");
                                interest_text_2_3.setText("보컬");
                                break;
                            case "1":
                                interest_1Btn.setText("1");
                                interest_2Btn.setText("2");
                                interest_3Btn.setText("3");
                                break;
                        }
                        break;

                    //1번째(1,4)
                    case R.id.interest_1Btn:
                        interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_2Btn.setBackgroundColor(Color.WHITE);
                        interest_3Btn.setBackgroundColor(Color.WHITE);
                        switch (interest_1Btn.getText().toString()){
                            case "1":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_health);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_game);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_music);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_drink);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_camp);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_book);

                                interest_text_1_1.setText("헬스");
                                interest_text_1_2.setText("게임");
                                interest_text_1_3.setText("음악");
                                interest_text_2_1.setText("음주");
                                interest_text_2_2.setText("캠핑");
                                interest_text_2_3.setText("책");
                                break;
                            case "4":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_makeup);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_travel);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_camera);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_food);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_fashion);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_dance);

                                interest_text_1_1.setText("메이크업");
                                interest_text_1_2.setText("여행");
                                interest_text_1_3.setText("사진/영상");
                                interest_text_2_1.setText("요리");
                                interest_text_2_2.setText("패션");
                                interest_text_2_3.setText("댄스");
                                break;
                        }
                        break;

                    //1번째(2,5)
                    case R.id.interest_2Btn:
                        interest_2Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_1Btn.setBackgroundColor(Color.WHITE);
                        interest_3Btn.setBackgroundColor(Color.WHITE);

                        switch (interest_2Btn.getText().toString()){
                            case "2":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_boardgame);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_car);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_cafe);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_drawing);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_soccer);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_movie);

                                interest_text_1_1.setText("보드게임");
                                interest_text_1_2.setText("자동차");
                                interest_text_1_3.setText("카페");
                                interest_text_2_1.setText("드로잉");
                                interest_text_2_2.setText("축구");
                                interest_text_2_3.setText("영화");
                                break;
                            case "5":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_bitcoin);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_swim);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_english);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_study);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_drive);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_programming);

                                interest_text_1_1.setText("비트코인");
                                interest_text_1_2.setText("수영");
                                interest_text_1_3.setText("영어");
                                interest_text_2_1.setText("공부");
                                interest_text_2_2.setText("드라이브");
                                interest_text_2_3.setText("프로그래밍");
                                break;
                        }
                        break;

                    //1번째(3,6)
                    case R.id.interest_3Btn:
                        interest_3Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_1Btn.setBackgroundColor(Color.WHITE);
                        interest_2Btn.setBackgroundColor(Color.WHITE);

                        switch (interest_3Btn.getText().toString()){
                            case "3":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_pet);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_surfing);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_fishing);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_stock);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_tv);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_vocal);

                                interest_text_1_1.setText("반려동물");
                                interest_text_1_2.setText("서핑");
                                interest_text_1_3.setText("낚시");
                                interest_text_2_1.setText("주식");
                                interest_text_2_2.setText("TV");
                                interest_text_2_3.setText("보컬");
                                break;
                            case "6":
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_furniture);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_tattoo);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_celebrity);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_golf);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_perfume);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_styling);

                                interest_text_1_1.setText("가구");
                                interest_text_1_2.setText("문신");
                                interest_text_1_3.setText("연예인");
                                interest_text_2_1.setText("골프");
                                interest_text_2_2.setText("향수");
                                interest_text_2_3.setText("스타일링");
                                break;
                        }
                        break;

                    //오른쪽버튼
                    case R.id.interest_rightBtn:
                        switch(interest_3Btn.getText().toString()) {
                            case "3":
                                interest_1Btn.setText("4");
                                interest_2Btn.setText("5");
                                interest_3Btn.setText("6");
                                interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                                interest_2Btn.setBackgroundColor(Color.WHITE);
                                interest_3Btn.setBackgroundColor(Color.WHITE);
                                interest_img_1_1.setBackgroundResource(R.drawable.icon_makeup);
                                interest_img_1_2.setBackgroundResource(R.drawable.icon_travel);
                                interest_img_1_3.setBackgroundResource(R.drawable.icon_camera);
                                interest_img_2_1.setBackgroundResource(R.drawable.icon_food);
                                interest_img_2_2.setBackgroundResource(R.drawable.icon_fashion);
                                interest_img_2_3.setBackgroundResource(R.drawable.icon_dance);

                                interest_text_1_1.setText("메이크업");
                                interest_text_1_2.setText("여행");
                                interest_text_1_3.setText("사진/영상");
                                interest_text_2_1.setText("요리");
                                interest_text_2_2.setText("패션");
                                interest_text_2_3.setText("댄스");
                                break;
                            case "6":
                                interest_1Btn.setText("4");
                                interest_2Btn.setText("5");
                                interest_3Btn.setText("6");
                                break;
                        }
                        break;

                    //다음버튼
                    case R.id.nextBtn :
                        //프로필설정으로 선택한 카테고리 이름 보내기
                        Intent a = new Intent(InterestActivity.this, ProfileActivity.class);
                        a.putExtra("interest_name",cur_name);
                        startActivity(a);
                        break;

                    case R.id.additionBtn:
                        Intent b = new Intent(InterestActivity.this, AdditionActivity.class);
                        startActivity(b);
                        break;
                }
            }
        };

        //클릭리스너 달기
        interest_leftBtn.setOnClickListener(onClickListener);
        interest_1Btn.setOnClickListener(onClickListener);
        interest_2Btn.setOnClickListener(onClickListener);
        interest_3Btn.setOnClickListener(onClickListener);
        interest_rightBtn.setOnClickListener(onClickListener);
        nextBtn.setOnClickListener(onClickListener);
        additionBtn.setOnClickListener(onClickListener);
        interest_img_1_1.setOnClickListener(onClickListener);
        interest_img_1_2.setOnClickListener(onClickListener);
        interest_img_1_3.setOnClickListener(onClickListener);
        interest_img_2_1.setOnClickListener(onClickListener);
        interest_img_2_2.setOnClickListener(onClickListener);
        interest_img_2_3.setOnClickListener(onClickListener);
    }
}