package com.RiZe.Modul1.Submission;

public class temp {
    //converting C to F
    public double CtoF(double temp){
        double res1 = (temp * 9/5) + 32;
        return res1;
    }
    //Converting F to K
    public double FtoK(double tmp) {
        double res2 = (tmp - 32) * 5/9 + 273;
        return res2;
    }
    //Converting K to R
    public double KtoR(double tmp) {
        double res3 = (tmp - 273) * 4/5;
        return res3;
    }
    //Converting R to F
    public double RtoF(double tmp ) {
        double res4 = tmp * 5/4;
        return res4;


        //failed inaccurate :'(
    }
}
