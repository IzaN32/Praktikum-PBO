package Com.RiZe.Meet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            //database dibuka
            System.out.println("Akses Elemen ke - 5\t: "+array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            //exception
            System.out.println("Array Exception");
        }finally {
            //database ditutup
            array[array.length-1] = 10;
            System.out.println("Nilai Elemen Terakhir\t: "+array[array.length-1]);
        }
    }

    public static class Try_Catch {
        public static void main(String[] args) {
            File file = new File("D:\\Keqing.txt");

            try{
                FileReader fileReader = new FileReader(file);
                System.out.println("Read Success");
            }catch (FileNotFoundException e){
                System.out.println("File Not Found!");
            }
        }
    }
}
