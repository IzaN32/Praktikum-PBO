package com.RiZe.Meet.Komposisi;

public class Cpu {
    private String processor;
    private String gpu;
    private String ram;

    public Cpu(String processor, String gpu, String ram){
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }
    public  void printSpec(){
        System.out.println("Processor\t: "+processor);
        System.out.println("GPU\t: "+gpu);
        System.out.println("Ram\t: "+ram+" GB");
        System.out.println();
    }
}
