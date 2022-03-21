package com.example.banbanh;

public class Language {
    private int imgBanh;
    private String tenBanh;
    private String tenCuahang;
    private String giabanh;

    public Language(int imgBanh, String tenBanh, String tenCuaHang, String giabanh) {
        this.imgBanh = imgBanh;
        this.tenBanh = tenBanh;
        this.tenCuahang=tenCuaHang;
        this.giabanh=giabanh;

    }
    public  String getTenBanh(){return tenBanh;}

    public  void setTenBanh(String tenBanh){this.tenBanh=tenBanh; }

    public int getImgBanh() {
        return imgBanh;
    }

    public void setImgBanh(int imgBanh) {
        this.imgBanh = imgBanh;
    }

    public String getTenCuahang() {
        return tenCuahang;
    }

    public void setTenCuahang(String tenCuahang) {
        this.tenCuahang = tenCuahang;
    }

    public  String getGiabanh(){return giabanh;}

    public  void setGiabanh(String giabanh){this.giabanh=giabanh;}
}
