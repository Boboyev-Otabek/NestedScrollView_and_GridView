package com.example.a4b_6m_3java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4b_6m_3java.R;
import com.example.a4b_6m_3java.model.Member;

import java.util.List;

public class AdapterMember extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Member> members;

    public AdapterMember(List<Member> members){
        this.members=members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        return new Memberholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if(holder instanceof Memberholder){
            Member member=members.get(position);

            TextView ism= ((Memberholder) holder).ism;
            TextView familiya= ((Memberholder) holder).familiya;

            ism.setText(member.getIsm());
            familiya.setText(member.getFamiliya());
        }
    }

    class Memberholder extends RecyclerView.ViewHolder{

        View view;

        TextView ism, familiya;
        Memberholder(View v){
            super(v);
            view=v;
            ism=v.findViewById(R.id.ism);
            familiya=v.findViewById(R.id.familiya);
        }
    }
}
