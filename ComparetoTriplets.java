package HackRank;

public class ComparetoTriplets {
    public static void main(String[] args) {
        int[] a = { 2,2,5};
        int[] b = {3,1,4};
        int[] d = compareTiplets(a,b);

        System.out.println("[" + d[0] +  "," +  d[1] +  "]");




         }
        public static int[] compareTiplets(int[] a , int[] b){
             int[] scores = {0 , 0 };

             for(int i = 0 ; i<a.length ; i++){
                 if(a[i] < b[i]){
                     scores[1]++;

                 }else if(a[i] > b[i]){
                     scores[0]++;
                 }
             }

            return scores;



        }

    }

