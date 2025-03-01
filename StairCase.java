package HackRank;

import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0 ; i < n ; i++){
            for(int k = 0; k < n-1-i ; k++){
                System.out.print("  ");
            }
            for ( int k = 0; k <i+1 ; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }


}
