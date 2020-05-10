package com.masudinn.adev.Model;

public class model {
    private String judul;
    private String desc;
    private int img;

//    public model(String judul, String desc, int img) {
//
//    }

    public model() {
        this.judul = judul;
        this.desc = desc;
        this.img = img;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
