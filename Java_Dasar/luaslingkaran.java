package Java_Dasar;

import java.util.Scanner;
public class luaslingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jari Jari!");
        Float phi = 3.14f;
        Float jariJari= scan.nextFloat();
        var lo = phi * jariJari * jariJari;
        System.out.print("Luas Lingkaran adalah = ");
        System.out.print(lo);
        scan.close();
    }
}
