package Java_Kampus;

import java.util.Scanner;

/**
 * rataRata
 */
public class rataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer angka1,angka2,angka3;
        angka1=5;
        angka2=2;
        angka3=2;
        
        Integer rataRata=(angka1+angka2+angka3)/3;
        System.out.println(rataRata);
        input.close();
    }
   
}