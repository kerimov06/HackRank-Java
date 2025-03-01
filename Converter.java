package HackRank;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter integer type: ");
            int num = scan.nextInt();
            String convertform = Integer.toString(num);
            if (num == Integer.parseInt(convertform)) {
                System.out.println("Good Job");
            } else {
               throw new Exception("Wrong answer");
            }

        }catch (Exception e){
            System.out.println(e);
            scan.close();
        }

    }
}
