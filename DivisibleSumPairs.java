package HackRank;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[]{1,3,4,2,6,8,5};
        System.out.println("Please enter the divise num: ");
        int divisenum = scan.nextInt();
        int result = 0;

        for( int i = 0 ; i<ar.length-1 ; i++){
            for(int j = i+1 ; j <ar.length ; j++) {
                if((ar[i]+ar[j])%divisenum==0){
                    result++;
                }
            }
        }
        System.out.println("Possible result is : " + result);
    }
}
