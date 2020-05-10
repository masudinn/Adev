package com.masudinn.adev.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.masudinn.adev.R;

public class DetailActivity extends AppCompatActivity {
    TextView tvJudul,tvDes;
    ImageView imgView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvJudul = findViewById(R.id.tittle);
        tvDes = findViewById(R.id.desc);
        imgView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String judul = intent.getStringExtra("Judul");
        String desc = intent.getStringExtra("Desc");
        byte[] mbyte = getIntent().getByteArrayExtra("imageV");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mbyte,0,mbyte.length);
        tvJudul.setText(judul);
        tvDes.setText(desc);
        //imgView.setImageBitmap(bitmap);
    }
}
