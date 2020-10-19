package com.RiZe.Polimorfisme;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu ("Fine Today");
        Lagu lagu2 = new Lagu ("Good", "Perfect");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
