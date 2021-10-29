package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {
    Button report_cancelBtn, report_reportBtn;
    EditText report_reportReason;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        report_cancelBtn = (Button)findViewById(R.id.report_cancelBtn);
        report_reportBtn = (Button)findViewById(R.id.report_reportBtn);
        report_reportReason = (EditText) findViewById(R.id.report_reportReason);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.report_cancelBtn:
                        Intent a = new Intent(ReportActivity.this, UserinfoActivity.class);
                        startActivity(a);
                        break;
                    case R.id.report_reportBtn:
                        Toast t = Toast.makeText(ReportActivity.this, "신고가 완료되었습니다.", Toast.LENGTH_SHORT);
                        t.show();
                        Intent b = new Intent(ReportActivity.this, ChatlistActivity.class);
                        startActivity(b);
                        break;
                }
            }
        };

        report_cancelBtn.setOnClickListener(onClickListener);
        report_reportBtn.setOnClickListener(onClickListener);
    }
}
