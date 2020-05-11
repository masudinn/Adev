package com.masudinn.adev.Activity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.masudinn.adev.R;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG ="DetailActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getincomeIntent();
    }

    private void getincomeIntent(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("imagename") &&
        getIntent().hasExtra("description")){
            String imageurl = getIntent().getStringExtra("image");
            String imagename = getIntent().getStringExtra("imagename");
            String description = getIntent().getStringExtra("description");

            setImage(imageurl,imagename,description);
        }
    }

    private void setImage(String imageurl,String imagename,String imagedesc){
        TextView name = findViewById(R.id.tittledtl);
        name.setText(imagename);
        TextView des = findViewById(R.id.descdtl);
        des.setText(imagedesc);
        ImageView img = findViewById(R.id.imagedtl);
        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(img);
    }
}
