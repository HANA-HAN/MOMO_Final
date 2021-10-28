package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AdditionActivity extends AppCompatActivity {
    Button addition_cancelBtn, addition_nextBtn;
    EditText addition_interestName;
    String interestName; //DB로 보낼 내용 저장시키는 변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //id연동
        addition_cancelBtn = (Button)findViewById(R.id.addition_cancelBtn);
        addition_nextBtn = (Button)findViewById(R.id.addition_nextBtn);

        addition_interestName = (EditText)findViewById(R.id.addition_interestName);
        //DB로 보낼 내용 저장시키는 변수에 값 할당
        interestName = addition_interestName.getText().toString();

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //신청버튼
                    case R.id.addition_nextBtn :
                        //프로필설정으로 선택한 카테고리 이름 보내기 -> 추가로 해당 내용 넘기는거 필요!
                        Toast t = Toast.makeText(AdditionActivity.this, "관심사 카테고리 추가가 신청되었습니다!", Toast.LENGTH_SHORT);
                        t.show();
                        addition_interestName.setText("");
                        Intent a = new Intent(AdditionActivity.this, InterestActivity.class);
                        startActivity(a);
                        finish();
                        break;
                    //취소버튼
                    case R.id.addition_cancelBtn:
                        Intent b = new Intent(AdditionActivity.this, InterestActivity.class);
                        startActivity(b);
                        finish();
                        break;
                }
            }
        };

        //클릭리스너 달기
        addition_cancelBtn.setOnClickListener(onClickListener);
        addition_nextBtn.setOnClickListener(onClickListener);
    }
}