package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WithdrawalActivity extends AppCompatActivity {
    Button withdrawal_backtomain, withdrawal_withdrawalBtn;
    RadioButton withdrawal_etcBtn;
    EditText withdrawal_etcDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdrawal);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        withdrawal_backtomain = (Button)findViewById(R.id.withdrawal_backtomain);
        withdrawal_withdrawalBtn = (Button)findViewById(R.id.withdrawal_withdrawalBtn);
        withdrawal_etcBtn = (RadioButton)findViewById(R.id.withdrawal_etcBtn);
        withdrawal_etcDetail = (EditText)findViewById(R.id.withdrawal_etcDetail);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    //클릭한 이미지에 따라 이름 전달 -> 받는 인텐트에서 이름을 기준으로 사진 연동
                    case R.id.withdrawal_backtomain:
                        Intent a = new Intent(WithdrawalActivity.this, MainActivity.class);
                        startActivity(a);
                        break;
                    case R.id.withdrawal_withdrawalBtn:
                        Toast t = Toast.makeText(WithdrawalActivity.this, "탈퇴가 완료되었습니다.", Toast.LENGTH_SHORT);
                        t.show();
                        //Intent b = new Intent(WithdrawalActivity.this, CustomerAuthActivity.class);
                        //startActivity(b);
                        Intent c = new Intent(WithdrawalActivity.this, MainActivity.class);
                        startActivity(c);
                        break;
                }
            }
        };
        withdrawal_backtomain.setOnClickListener(onClickListener);
        withdrawal_withdrawalBtn.setOnClickListener(onClickListener);
    }
}
