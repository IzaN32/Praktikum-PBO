package com.RiZe.Meet.Abstrak;

public class Anjim extends  Binatang {
    private  String nama;

    public  Anjim(String nama){
        super("Anjim");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.print("GUKKK GUKKK");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
