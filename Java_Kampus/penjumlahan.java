package Java_Kampus;
import java.util.Scanner;

public class penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan 1...");
        int bil1 = input.nextInt();
        System.out.println("Masukkan Bilangan 2...");
        int bil2 = input.nextInt();
        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahan dari " + bil1 +" + " + bil2 + " Adalah = 2" + hasil );
    }
}
