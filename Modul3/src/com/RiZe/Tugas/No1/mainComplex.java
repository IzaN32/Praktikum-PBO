package com.RiZe.Tugas.No1;

import java.util.ArrayList;
import java.util.List;

public class mainComplex {
    public static void main(String[] args) {
        Complex complex = new Complex("6132", "Pesarean");

        House house1 = new House("032", "Wagimin", 3);
        House house2 = new House("033", "Guritno", 2);
        House house3 = new House("034", "Wilujeng", 2);
        House house4 = new House("035", "Handoko", 4);
        House house5 = new House("037", "Suparmin", 5);

        List<House> houseList = new ArrayList<>();

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        houseList.add(new House("036", "Udin", 6));

        complex.setTotHouse(houseList.size() + 1);
        complex.setIdHouse(houseList);
        complex.addRumah(house5);
        complex.getDataKomplek();
    }
}
