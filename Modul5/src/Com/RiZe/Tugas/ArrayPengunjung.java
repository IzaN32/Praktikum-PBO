package Com.RiZe.Tugas;

import java.util.Scanner;

public class ArrayPengunjung {
    public static void main(String[] args) throws Exception {
        System.out.print("Total Visitors: ");
        int scan = show();

        try {
            if (scan <= 10) {
                //array  visitors
                int[] tVisitors = new int[scan];
                // read from array
                for (int i = 0; i < tVisitors.length ; i++) {
                    System.out.print("Data-" + i + ":\t");
                    tVisitors[i] = show();
                }
                System.out.println("\nShow Visitor's Data");
                while  (true) {
                    System.out.print("Index :\t");
                    int showData = show();
                    if (showData > tVisitors.length) {
                        throw new Exception("Index " + showData + " not found(?)");
                    }

                    System.out.println("Data-" + showData + " " + tVisitors[showData]);
                    System.out.print("Show data again?(Y/N) : ");
                    String sData = scanString();
                    if(sData == "n" || sData == "N") {
                        break;
                    }
                }
            } else {
                throw new Exception("Oops no more than 10!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int show() {
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        return (int) result;
    }
    public static String scanString() {
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        return (String) result;
    }
}

