package com.masudinn.adev;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masudinn.adev.Activity.DetailActivity;
import com.masudinn.adev.Model.model;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<model> models;

    public myadapter(Context c,ArrayList<model> models){
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int i) {
        holder.tvTittle.setText(models.get(i).getJudul());
        holder.tvDesc.setText(models.get(i).getDesc());
        holder.imageView.setImageResource(models.get(i).getImg());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String judul = models.get(position).getJudul();
                String desc = models.get(position).getDesc();
                BitmapDrawable img = (BitmapDrawable)holder.imageView.getDrawable();
                Bitmap bitmap = img.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
                byte[] bytes = stream.toByteArray();
                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onItemClickListener(View v, int position) {
                        if(models.get(position).getJudul().equals("OVO")){

                        }
                        if(models.get(position).getJudul().equals("Bukalapak")){

                        }
                        if(models.get(position).getJudul().equals("Tokopedia")){

                        }
                        if(models.get(position).getJudul().equals("Marketplace Facebook")){

                        }
                        if(models.get(position).getJudul().equals("Gojek")){

                        }
                        if(models.get(position).getJudul().equals("Gopay")){

                        }
                        if(models.get(position).getJudul().equals("OLX")){

                        }
                        if(models.get(position).getJudul().equals("Shopee")){

                        }
                        if(models.get(position).getJudul().equals("Grab")){

                        }




                    }
                });
                Intent intent = new Intent(c, DetailActivity.class);
                intent.putExtra("Judul",judul);
                intent.putExtra("Desc",desc);
                intent.putExtra("imageV",bytes);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
