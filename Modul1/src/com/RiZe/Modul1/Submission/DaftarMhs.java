package com.RiZe.Modul1.Submission;

import java.util.Scanner;
public class DaftarMhs {
    //Variables
    private String name = "[Error]";
    private String clas = "[Error]";
    private int ID = 00000000;

    //Constructor #1
    public DaftarMhs() {}

    //Constructor #2
    public DaftarMhs(String name, String clas, int ID) {
        this.name = name;
        this.clas = clas;
        this.ID = ID;
    }
    //Getter(s) & Setter(s)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClas() {
        return clas;
    }
    public void setClas(String clas) {
        this.clas = clas;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
 class Daftar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarMhs profile;

        System.out.println("Registrasi MaBa");
        System.out.println();

        System.out.print("Nama: ");
        String Name = input.nextLine();

        System.out.print("Masukan Class: ");
        String Class = input.nextLine();

        System.out.print("Masukan Id: ");
        String Id = input.nextLine();

        int id;
        if (Id.isEmpty())
            id = 0;
        else
            id = Integer.parseInt(Id);

        if (!Name.equals("") && !Class.equals("") && id >= 10000000 && id <= 99999999)
            profile = new DaftarMhs(Name, Class, id);
        else
            profile = new DaftarMhs();
        System.out.println("Saved");

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu Utama");
            System.out.println();
            System.out.println("1. Lihat Data");
            System.out.println("2. Ganti Nama");
            System.out.println("3. Pindah Kelas");
            System.out.println("4. Ganti Id");
            System.out.println("0. Keluar");
            System.out.println();
            char nav = input.next().charAt(0);
            System.out.println();

            switch (nav) {
                case '1':
                    System.out.println("Nama lengkap: " + profile.getName());
                    System.out.println("Kelas: " + profile.getClas());
                    System.out.println("Id: " + profile.getID());
                    break;

                case '2':
                    System.out.print("Masukkan nama baru : ");
                    String nameFix = input.nextLine();
                    profile.setName(nameFix);
                    System.out.println("Nama diganti!");
                    break;

                case '3':
                    System.out.print("Masukkan nama kelas baru: ");
                    String classFix = input.nextLine();
                    profile.setClas(classFix);
                    System.out.println("Kelas diganti!");

                case '4':
                    System.out.print("Masukan Id Anda: ");
                    int newID = input.nextInt();
                    profile.setID(newID);
                    System.out.println("Id diganti!");

                case '0':
                    System.out.println("Anda yakin ingin keluar? (Y/N)");
                    nav = input.nextLine().charAt(0);

                    if (nav=='y'|| nav=='Y') {
                        exit = true;
                        System.out.println("Exiting...");
                    }
                    else
                        System.out.println("Return");
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println("\nPress any key...");
            input.nextLine();
            System.out.println();
        }
    }
}