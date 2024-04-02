package com.example.day06;

public class ModelLaptop {
    private String namaLaptop;
    private int gambarLaptop;
    private String deskripsiLaptop;
    private double hargaLaptop;

    public ModelLaptop(String namaLaptop, int gambarLaptop, String deskripsiLaptop, double hargaLaptop) {
        this.namaLaptop = namaLaptop;
        this.gambarLaptop = gambarLaptop;
        this.deskripsiLaptop = deskripsiLaptop;
        this.hargaLaptop = hargaLaptop;
    }


    public String getDeskripsiLaptop() {
        return deskripsiLaptop;
    }

    public void setDeskripsiLaptop(String deskripsiLaptop) {
        this.deskripsiLaptop = deskripsiLaptop;
    }

    public double getHargaLaptop() {
        return hargaLaptop;
    }

    public void setHargaLaptop(double hargaLaptop) {
        this.hargaLaptop = hargaLaptop;
    }


    public String getNamaLaptop() {
        return namaLaptop;
    }

    public void setNamaLaptop(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }

    public int getGambarLaptop() {
        return gambarLaptop;
    }

    public void setGambarLaptop(int gambarLaptop) {
        this.gambarLaptop = gambarLaptop;
    }
}