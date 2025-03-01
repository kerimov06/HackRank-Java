package HackRank;

public class NumbertoString {
    public static void main(String[] args) {
        String[] birler = {" " , "bir" , "iki" , "uc" , "dord" , "bes" , "alti" , "yeddi" , "sekkiz" , "doqquz"};
        String[] onlar = {" " , "on" , "iyirmi" , "otuz" , "qirx" , "elli" , "altmis" , "yetmis" , "seksen" , "doqsan"};
        String[] yuzler = {" " , "yuz" , "iki yuz" , "uc yuz" , "dord yuz" , "bes yuz" , "alti yuz" , "yeddi yuz" , "sekkiz yuz" , "doqquz yuz"};
        int num = 23415;
        int yuzminlerBasamaqi = num%1000000/100000;
        int onminlerBasamaqi = num%100000/10000;
        int minlerBasamaqi = num%10000/1000;
        int yuzlerBasmaqi = num%1000/100;
        int onlarBasamaqi = num%100/10;
        int birlerBasamaqi = num%10/1;
        String yazi = yuzler[yuzminlerBasamaqi] + " " + onlar[onminlerBasamaqi] + " " + birler[minlerBasamaqi];
        if(num>999) yazi = yazi +  " " + "min" + " ";
        yazi= yazi + yuzler[yuzlerBasmaqi] + " " + onlar[onlarBasamaqi] + " " + birler[birlerBasamaqi];
        for(int i = 0 ; i < yazi.length() ; i++){
            if(yazi.substring(0,1).equals(" ")) yazi = yazi.substring(1);

            }
        System.out.println(yazi);






    }


}
