package HackRank;

import java.util.HashMap;

public class Rekord {
    public static void main(String[] args) {

       int[] sureler = {19,10,33,20,15};

        HashMap<Integer,Integer> has = new HashMap<>();
          int record  = 0 ;
          int enhizliSure = Integer.MAX_VALUE;

          for (int i = 0; i < sureler.length; i++){
              has.put(i+1 , sureler[i]);

              if(sureler[i]<enhizliSure){
                  enhizliSure = sureler[i];
                  record++;
              }
          }
        System.out.println("Sporcularin sureleri: " + has);
        System.out.println("Toplam rekor: " + record);

          }

    }


