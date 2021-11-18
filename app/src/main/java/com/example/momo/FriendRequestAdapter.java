package com.example.momo;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FriendRequestAdapter extends RecyclerView.Adapter<FriendRequestAdapter.CustomViewHolder> {
    private ArrayList<FriendRequestData> arrayList;

    public FriendRequestAdapter(ArrayList<FriendRequestData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public FriendRequestAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_friendrequest,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendRequestAdapter.CustomViewHolder holder, int position) {
        holder.iv_interest_img.setImageResource(arrayList.get(position).getIv_interest_img());
        holder.tv_nickname.setText(arrayList.get(position).getTv_nickname());
        holder.tv_introduce.setText(arrayList.get(position).getTv_introduce());

//        holder.btn_accept.setTag(position);
//        holder.btn_accept.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int btnPosition = (int) view.getTag();
//                arrayList.remove(btnPosition);
//                notifyDataSetChanged();
//            }
//        });

        holder.btn_accept.setTag(position);
        holder.btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(holder.getAdapterPosition()); //삭제
                Toast.makeText(view.getContext(), "수락", Toast.LENGTH_SHORT).show();
                return;
            }
        });
        holder.btn_reject.setTag(position);
        holder.btn_reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(holder.getAdapterPosition());
                Toast.makeText(view.getContext(), "거절", Toast.LENGTH_SHORT).show();
                return;
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public void remove(int position){
        try{
            arrayList.remove(position);
            notifyItemRemoved(position);
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView iv_interest_img;
        protected TextView tv_nickname;
        protected TextView tv_introduce;
        protected Button btn_accept;
        protected Button btn_reject;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_interest_img = (ImageView) itemView.findViewById(R.id.iv_interest_img);
            this.tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
            this.tv_introduce = (TextView) itemView.findViewById(R.id.tv_introduce);
            this.btn_accept = (Button) itemView.findViewById(R.id.btn_accept);
            this.btn_reject = (Button) itemView.findViewById(R.id.btn_reject);
        }
    }
}