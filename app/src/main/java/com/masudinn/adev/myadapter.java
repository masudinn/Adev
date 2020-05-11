package com.masudinn.adev;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.masudinn.adev.Activity.DetailActivity;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mImagename = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private Context mcontext;

    //constructor object diatas
    public myadapter( Context mcontext, ArrayList<String> mImage,ArrayList<String> mImagename, ArrayList<String> mDesc) {
        this.mImagename = mImagename;
        this.mImage = mImage;
        this.mDesc = mDesc;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"OnBindViewHolder : called.");
        Glide.with(mcontext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.image);
        holder.imagename.setText(mImagename.get(position));
        holder.imgdesc.setText(mDesc.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClick : clicked on:"+mImagename.get(position)+mDesc.get(position));
                Toast.makeText(mcontext, mImagename.get(position), Toast.LENGTH_SHORT).show();

                //getdetailactivity
                Intent intent = new Intent(mcontext, DetailActivity.class);
                intent.putExtra("image",mImage.get(position));
                intent.putExtra("imagename",mImagename.get(position));
                intent.putExtra("description",mDesc.get(position));
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImagename.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imagename;
        TextView imgdesc;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imagename = itemView.findViewById(R.id.imagename);
            imgdesc = itemView.findViewById(R.id.imagedesc);
            parentLayout = itemView.findViewById(R.id.parentlayout);
        }

    }
}
