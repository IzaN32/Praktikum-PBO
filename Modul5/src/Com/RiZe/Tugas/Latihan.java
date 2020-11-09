package Com.RiZe.Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        System.out.print("Input array length\t: ");
        int[] array = new int[intInputMethod()];

        try {
            System.out.println("Masukkan data\t: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            }
            System.out.println("\nOutput\t: ");
            for (int x : array) {
                System.out.println("Data\t: " + x);
            }
        }catch (InputMismatchException e){
            System.out.println("Masukkan nomor");
            System.out.println("Masukkan data\t: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            }
            System.out.println("\nOutput\t: ");
            for (int x : array) {
                System.out.println("Data\t: " + x);
            }
        }
    }

    public  static int intInputMethod(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
    }
