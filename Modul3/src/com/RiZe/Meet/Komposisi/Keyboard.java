package com.RiZe.Meet.Komposisi;

public class Keyboard {
    private String merek;
    private String type;

    public Keyboard(String merek, String type){
        this.merek = merek;
        this.type = type;
    }
    public void PrintSpec(){
        System.out.println("- Merk\t: " + merek);
        System.out.println("- Type\t: " + type);
        System.out.println();
    }
}
