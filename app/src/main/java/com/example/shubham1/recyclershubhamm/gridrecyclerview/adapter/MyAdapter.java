package com.example.shubham1.recyclershubhamm.gridrecyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shubham1.recyclershubhamm.R;
import com.example.shubham1.recyclershubhamm.gridrecyclerview.grids.Grids;
import com.example.shubham1.recyclershubhamm.gridrecyclerview.model.Model;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Model>arrayList;
    private Context context;

    public MyAdapter(ArrayList<Model>arrayList,Context context)
    {
        this.arrayList=arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Model model = arrayList.get(position);
        holder.tv_text.setText(model.getName());
        holder.iv_image.setImageResource(model.getImages());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), Grids.class);
                 intent.putExtra("text",model.getName());
                 intent.putExtra("images",model.getImages());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_text;
        private ImageView iv_image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image=itemView.findViewById(R.id.iv_image);
            tv_text=itemView.findViewById(R.id.tv_text);

        }
    }
}
