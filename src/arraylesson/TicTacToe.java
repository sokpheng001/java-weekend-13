package arraylesson;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String [][] board = new String[3][3];
        System.out.println("\n-----------------------");
        for (String [] row: board){
            for(String col: row){
                System.out.print("     " + " | ");
            }
            System.out.println("\n-----------------------");
        }
        label:
       while (true){
           System.out.println("--- Insert to Draw ---".toUpperCase());
           System.out.print("[+] Insert number of row: ");
           int row = new Scanner(System.in).nextInt();
           System.out.print("[+] Insert number of column: ");
           int col = new Scanner(System.in).nextInt();
           board[row-1][col-1] = "X";
           System.out.println("\n-----------------------");
           for (String [] row1: board){
               for(String col1: row1){
                   if(col1==null){
                       System.out.print("    " + " | ");
                   }else {
                       System.out.print("  " + col1 + "  | ");
                   }
               }
               System.out.println("\n-----------------------");
           }

           // check if win
           for (String [] row1: board){
               for(String col1: row1){
                   if(board[0][0].equals(board[0][1]) &&
                           board[0][0].equals(board[0][2]) &&
                           board[0][1].equals(board[0][2])){
                       System.out.println("Winner");
                       break label;
                   }
               }
           }
       }
    }
}
