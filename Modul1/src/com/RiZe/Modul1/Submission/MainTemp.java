package com.RiZe.Modul1.Submission;

import java.util.Scanner;

public class MainTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        temp convTemp = new temp();
        System.out.print("Input temperature in celsius: ");
        var suhu = scan.nextFloat();

        //Converting C to F
        var fahr = convTemp.CtoF(suhu);
        System.out.println("Celsius to Fahrenheit: "+fahr +"°F");

        //Converting Fahrenheit to Kelvin
        var kelv = convTemp.FtoK(fahr);
        System.out.println("Fahrenheit to Kelvin: "+kelv +"°K");

        //Converting Kelvin to Reamur
        var ream = convTemp.KtoR(kelv);
        System.out.println("Kelvin to Reamur: "+ream+"°R");

        //COnverting Reamur to Celcius
        var cels = convTemp.CtoF(ream);
        System.out.println("Reamur to Celcius: "+cels+"°C");

    }
}
