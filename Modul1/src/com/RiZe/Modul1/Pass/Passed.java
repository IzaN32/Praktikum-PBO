package com.RiZe.Modul1.Pass;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        // passed by reference
        TestPass pass = new TestPass(50,100);
        // passed by value
        nomer1 = 10;
        nomer2 = 20;

        // passed by value
        System.out.println("Nilai sebelum passed by Value\t: ");
        System.out.println("nomer 1 = "+nomer1);
        System.out.println("nomer 2 = "+nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by Value: ");
        System.out.println("nomer 1 = "+nomer1);
        System.out.println("nomer 2 = "+nomer2);

        // passed by reference
        System.out.println("Nilai sebelum passed by Reference\t: ");
        System.out.println("nomer 1 = "+pass.nomer1);
        System.out.println("nomer 2 = "+pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by Reference: ");
        System.out.println("nomer 1 = "+pass.nomer1);
        System.out.println("nomer 2 = "+pass.nomer2);
    }
}
