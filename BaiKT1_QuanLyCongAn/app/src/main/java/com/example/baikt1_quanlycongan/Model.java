package com.example.baikt1_quanlycongan;

public class Model {
    private String ten,capbac,noicongtac,quocgia,sao;
    private int hinh;

    public Model(String ten, String capbac, String noicongtac, String quocgia, String sao, int hinh) {
        this.ten = ten;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.quocgia = quocgia;
        this.sao = sao;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
