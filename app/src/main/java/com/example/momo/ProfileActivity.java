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

//    public static final String GOOGLE_ACCOUNT="google_account";
//    private TextView profileName, profileEmail;
//    private GoogleSignInAccount mGoogleSignInAccount;
//    private GoogleSignInClient mGoogleSignInClient;


    ImageView selected_interest_image;
    String cur_name = "";
    //닉네임과 소개글
    EditText et_name, et_introduce;
    //메인으로 가는 버튼
    Button nextBtn2main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .build();
//        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);

//        et_name = findViewById(R.id.et_name);
//        et_introduce = findViewById(R.id.et_introduce);

//        findViewById(R.id.nextBtn2main).setOnClickListener((View.OnClickListener) this);

//        mGoogleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
//        setDataOnView();

        selected_interest_image = (ImageView)findViewById(R.id.selected_interest_image);
        et_name = (EditText)findViewById(R.id.et_name);
        et_introduce = (EditText)findViewById(R.id.et_introduce);
        Intent getfromInterest = getIntent();
        cur_name = getfromInterest.getExtras().getString("interest_name");
        switch (cur_name) {
            case "사진/영상":
                selected_interest_image.setImageResource(R.drawable.icon_camera);
                break;
            case "패션":
                selected_interest_image.setImageResource(R.drawable.icon_fashion);
                break;
            case "메이크업":
                selected_interest_image.setImageResource(R.drawable.icon_makeup);
                break;
            case "댄스":
                selected_interest_image.setImageResource(R.drawable.icon_dance);
                break;
            case "요리":
                selected_interest_image.setImageResource(R.drawable.icon_food);
                break;
            case "여행":
                selected_interest_image.setImageResource(R.drawable.icon_travel);
                break;
            case "헬스":
                selected_interest_image.setImageResource(R.drawable.icon_health);
                break;
            case "캠핑":
                selected_interest_image.setImageResource(R.drawable.icon_camp);
                break;
            case "게임":
                selected_interest_image.setImageResource(R.drawable.icon_game);
                break;
            case "책":
                selected_interest_image.setImageResource(R.drawable.icon_book);
                break;
            case "음악":
                selected_interest_image.setImageResource(R.drawable.icon_music);
                break;
            case "음주":
                selected_interest_image.setImageResource(R.drawable.icon_drink);
                break;
            case "보드게임":
                selected_interest_image.setImageResource(R.drawable.icon_boardgame);
                break;
            case "자동차":
                selected_interest_image.setImageResource(R.drawable.icon_car);
                break;
            case "카페":
                selected_interest_image.setImageResource(R.drawable.icon_cafe);
                break;
            case "드로잉":
                selected_interest_image.setImageResource(R.drawable.icon_drawing);
                break;
            case "축구":
                selected_interest_image.setImageResource(R.drawable.icon_soccer);
                break;
            case "영화":
                selected_interest_image.setImageResource(R.drawable.icon_movie);
                break;
            case "반려동물":
                selected_interest_image.setImageResource(R.drawable.icon_pet);
                break;
            case "서핑":
                selected_interest_image.setImageResource(R.drawable.icon_surfing);
                break;
            case "낚시":
                selected_interest_image.setImageResource(R.drawable.icon_fishing);
                break;
            case "주식":
                selected_interest_image.setImageResource(R.drawable.icon_stock);
                break;
            case "TV":
                selected_interest_image.setImageResource(R.drawable.icon_tv);
                break;
            case "보컬":
                selected_interest_image.setImageResource(R.drawable.icon_vocal);
                break;
            case "비트코인":
                selected_interest_image.setImageResource(R.drawable.icon_bitcoin);
                break;
            case "수영":
                selected_interest_image.setImageResource(R.drawable.icon_swim);
                break;
            case "영어":
                selected_interest_image.setImageResource(R.drawable.icon_english);
                break;
            case "공부":
                selected_interest_image.setImageResource(R.drawable.icon_study);
                break;
            case "드라이브":
                selected_interest_image.setImageResource(R.drawable.icon_drive);
                break;
            case "프로그래밍":
                selected_interest_image.setImageResource(R.drawable.icon_programming);
                break;
            case "가구":
                selected_interest_image.setImageResource(R.drawable.icon_furniture);
                break;
            case "문신":
                selected_interest_image.setImageResource(R.drawable.icon_tattoo);
                break;
            case "연예인":
                selected_interest_image.setImageResource(R.drawable.icon_celebrity);
                break;
            case "골프":
                selected_interest_image.setImageResource(R.drawable.icon_golf);
                break;
            case "향수":
                selected_interest_image.setImageResource(R.drawable.icon_perfume);
                break;
            case "스타일링":
                selected_interest_image.setImageResource(R.drawable.icon_styling);
                break;
        }

        nextBtn2main = (Button)findViewById(R.id.nextBtn2main);
        nextBtn2main.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextBtn2main.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                i.putExtra("nickname", et_name.getText().toString());
                i.putExtra("introduce", et_introduce.getText().toString());
                i.putExtra("interest_name",cur_name);
                startActivity(i);
                finish();
            }
        });
    }

//    private void setDataOnView() {
//        et_name.setText(mGoogleSignInAccount.getDisplayName());
//        et_introduce.setText(mGoogleSignInAccount.getDisplayName());
//    }
}