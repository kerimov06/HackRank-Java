package HackRank;

public class TekrarArr {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,2};
        Integer tekrarSayi = Integer.MAX_VALUE;
        for( int i = 0 ; i < arr.length ; i++){
            if(i>tekrarSayi){
                System.out.println("En cox tekrarlanan: " + i);
            }


        }
    }

}
