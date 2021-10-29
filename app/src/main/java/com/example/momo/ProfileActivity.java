package com.example.momo;

import static com.example.momo.InterestActivity.myInterestname;

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
    //닉네임과 소개글
    EditText et_name, et_introduce;
    //메인으로 가는 버튼
    Button nextBtn2main;

    public static String myNickname = "";
    public static String myIntroduce = "";


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


        //전역변수인 사용자의닉네임과 소개글을 저장
        et_name = (EditText)findViewById(R.id.et_name);
        et_introduce = (EditText)findViewById(R.id.et_introduce);


        //id연동 후 전역변수인 interestname의 값에 따라 이미지 매핑
        selected_interest_image = (ImageView)findViewById(R.id.selected_interest_image);
        switch (myInterestname) {
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
                //버튼을 클릭했을때 해당 값들이 들어와야하기 때문에 onclick으로 달아줘야함
                myNickname = et_name.getText().toString();
                myIntroduce = et_introduce.getText().toString();
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(i);
                //finish();
            }
        });
    }

//    private void setDataOnView() {
//        et_name.setText(mGoogleSignInAccount.getDisplayName());
//        et_introduce.setText(mGoogleSignInAccount.getDisplayName());
//    }
}