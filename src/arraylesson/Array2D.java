package arraylesson;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /**
         * 1. Create a two-dimensional array called names as String
         * that has 3 ROWs and EACH ROW has 4 COLUMNs
         * 2. Assign the value to each column of rows
         * 3. Print all the value as table format of above array 2D
         */
        System.out.print("[+] Insert number of row: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert number of column: ");
        int col = new Scanner(System.in).nextInt();
        String [][] names = new String[row][col];
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++) {
                System.out.print("[+] Insert value of row[" + i + "]" +
                        " and column[" + j + "]: ");
                names[i][j] = new Scanner(System.in).nextLine();
            }
        }
        // print all values
        System.out.println("-".repeat(20));
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++) {
                System.out.print(names[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
