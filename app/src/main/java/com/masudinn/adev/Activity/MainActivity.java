package com.masudinn.adev.Activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.masudinn.adev.R;
import com.masudinn.adev.myadapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate: started");
        initImgBitmap();
    }

    private void initImgBitmap(){
        mImage.add("https://img.okeinfo.net/content/2020/03/27/49/2190225/pemain-persib-yang-positif-terinfeksi-covid-19-adalah-wander-luiz-MUPS4A2Qw7.jpg");
        mName.add("Wander Louis");
        mDesc.add("Pemain depan");

        mImage.add("https://cdn-asset.jawapos.com/wp-content/uploads/2019/01/aliando-striker-asing-persib-yang-diwaspadai-persebaya_m_230531-640x446.jpg");
        mName.add("Ndousel");
        mDesc.add("Pemain depan");

        mImage.add("https://assets.pikiran-rakyat.com/crop/0x0:0x0/750x500/photo/2019/01/BG9urcg6VAccVa23i07NCcOp3sjxwMl95iEHXQ33.jpeg");
        mName.add("Miljan Radovic");
        mDesc.add("Pemain depan");

        mImage.add("https://d10dnch8g6iuzs.cloudfront.net/pictures/480x306/picture/413201802051001160");
        mName.add("Essien");
        mDesc.add("Pemain tengah");

        mImage.add("https://i0.wp.com/bandungkita.id/wp-content/uploads/2018/12/Pemain-Persib-Atep.jpg?fit=533%2C300&ssl=1");
        mName.add("Firman Utina");
        mDesc.add("Pemain sayap");

        mImage.add("https://cdn0-production-images-kly.akamaized.net/dclUbDLZVVR0YbwDB9pA7_6wDI4=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2887339/original/076433900_1566296335-20190820_154700.jpg");
        mName.add("Nick Kuipers");
        mDesc.add("Pemain belakang");

        initrecyclerView();
    }

    private void initrecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.rc);
        //add value parameter constructor in myadapter at here
        myadapter myadapters = new myadapter(this,mImage,mName,mDesc);
        recyclerView.setAdapter(myadapters);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }}