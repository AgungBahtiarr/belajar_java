package Java_Dasar;

import java.util.Scanner;

public class kelulusanKontrak {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Masukkan Nilai tugas...");
    Integer tugas = scan.nextInt();
    double totaltugas=tugas*(0.30);
    System.out.println("Masukkan Nilai absen...");
    Integer absen = scan.nextInt();
    double totalabsen=absen*(0.30);
    System.out.println("Masukkan Nilai uts...");
    Integer uts = scan.nextInt();
    double totaluts=uts*(0.20);
    System.out.println("Masukkan Nilai uas...");
    Integer uas = scan.nextInt();
    double totaluas=uas*(0.20);
    double total = totaltugas + totalabsen + totaluts + totaluas;
    System.out.println(total);

    if(total<(56)){
        System.out.println("anda tidak lulus");
        System.out.println(total+" = nilai anda");
    }else{
        System.out.println("anda lulus");
        System.out.println(total+" = nilai anda");
    }
    scan.close();
    }
}
