package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class FirebaseActivity extends AppCompatActivity {
    //고객테이블
    public int customerID;
    public String nickname;
    public Long introduce;
    public int reported;
    //관심사테이블
    public int interestID;
    //중고거래테이블
    public int tradeID;
    public String title;
    public String context;
    public int price;
    public String picture;
    //신고테이블
    public int reportID;
    public Long reportContext;
    //매칭테이블
    public int matchID;
    //채팅테이블
}
