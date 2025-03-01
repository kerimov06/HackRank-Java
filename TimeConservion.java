package HackRank;

public class TimeConservion {
    public static void main(String[] args) {
        String s = "12:00:00AM";
        String ss = s.substring(0,2);
        int sayi  = Integer.parseInt(ss);
        if( s.startsWith("12") && s.endsWith("AM")) s = "00" + s.substring(2);
        if(s.endsWith("PM")){
            if(sayi<12) sayi+=12;
            ss = String.valueOf(sayi);
            s = ss + s.substring(2);

        }
        s=s.substring(0,s.length() - 2);
        System.out.println("s =" + s);

    }


}
