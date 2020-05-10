package com.masudinn.adev;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView imageView;
    TextView tvTittle,tvDesc;
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        tvTittle = itemView.findViewById(R.id.tittle);
        tvDesc = itemView.findViewById(R.id.desc);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v,getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener CL){
        this.itemClickListener = CL;
    }
}
