package com.example.momo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class ProfileActivity extends AppCompatActivity {

    public static final String GOOGLE_ACCOUNT="google_account";
    private TextView profileName, profileEmail;
    private GoogleSignInAccount mGoogleSignInAccount;
    private GoogleSignInClient mGoogleSignInClient;


    EditText et_name, et_introduce;
    Button nextBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);


        et_name = findViewById(R.id.et_name);
        et_introduce = findViewById(R.id.et_introduce);

        findViewById(R.id.nextBtn2).setOnClickListener((View.OnClickListener) this);

        mGoogleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
        setDataOnView();

        et_name = (EditText)findViewById(R.id.et_name);
        et_introduce = (EditText)findViewById(R.id.et_introduce);
        nextBtn2 = (Button)findViewById(R.id.nextBtn2);
        nextBtn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextBtn2.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void setDataOnView() {
        et_name.setText(mGoogleSignInAccount.getDisplayName());
        et_introduce.setText(mGoogleSignInAccount.getDisplayName());
    }
}