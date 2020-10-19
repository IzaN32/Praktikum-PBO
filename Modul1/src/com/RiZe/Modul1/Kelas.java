package com.RiZe.Modul1;

public class Kelas {
    private static String name = "Paimon";

    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: "+name);
        System.out.println("Set Minute\t: "+setMinute());
    }
}
