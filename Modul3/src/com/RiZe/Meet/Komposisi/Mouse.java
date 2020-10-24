package com.RiZe.Meet.Komposisi;

public class Mouse {
    private String merk;
    private  String DPI;

    public Mouse(String merk, String DPI){
        this.merk = merk;
        this.DPI = DPI;
    }
    public void printSpec(){
        System.out.println("- Merk\t:"+merk);
        System.out.println("- DPI\t:"+DPI);
        System.out.println();
    }
}
