package com.masudinn.adev.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.masudinn.adev.myadapter;
import com.masudinn.adev.Model.model;
import com.masudinn.adev.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    myadapter myadapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myadapters = new myadapter(this,list());
        recyclerView.setAdapter(myadapters);
    }
    public ArrayList<model> list() {
        ArrayList<model> models =new ArrayList<>();
        model mdl = new model();
        mdl.setJudul("OVO");
        mdl.setDesc("ovooooooooooooooooooooooooooooooooooooooooooooooo\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.ovo);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Bukalapak");
        mdl.setDesc("Bukalapaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.bl);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Blibli");
        mdl.setDesc("Blibliiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.blibli);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Tokopedia");
        mdl.setDesc("Tokpediaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.tokopedia);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Marketplace Facebook");
        mdl.setDesc("efbeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.fb);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Gojek");
        mdl.setDesc("gojeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeekkkk\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.gojek);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Gopay");
        mdl.setDesc("Gopaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayy\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.gopay);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("OLX");
        mdl.setDesc("Oeeleeexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.olx);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Shopee");
        mdl.setDesc("shopeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.shopee);
        models.add(mdl);

        mdl = new model();
        mdl.setJudul("Grab");
        mdl.setDesc("graaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbb\n" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                "aassssssssssssssssssssssssssssssssssssssssssssssssssssss");
        mdl.setImg(R.drawable.grab);
        models.add(mdl);

        return models;
    }
}
