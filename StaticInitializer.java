package HackRank;

import java.util.Scanner;

public class StaticInitializer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Pleas enter paleogram breadth: ");
            int b = scan.nextInt();
            System.out.println("Please enter paleogram height: ");
            int h = scan.nextInt();
            if (b >= 0 && h >= 0) {
                int r = b * h;
                System.out.println("Area of Paleogram is : " + r);
        }else {
            System.out.println("ERROR!  Breadth and height must be positive");
        }

        }
    }

