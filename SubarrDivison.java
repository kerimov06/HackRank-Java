package HackRank;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrDivison  {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,4,1,3,2));
        int d = 4;
        int m = 2;
        int result = 0;

        for(int i = 0; i < arr.size()-m+1 ; i++){
             int sum=0;
               for ( int j = 0 ; j<m ; j++){
                   sum += arr.get(i+j);
            }
               if ( sum ==4) result++;

        }
        System.out.println("result: " + result);
    }
}
