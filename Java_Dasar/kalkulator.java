package Java_Dasar;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan Operator + - * / % ");
        var operator = keyboard.nextLine();

        switch (operator) {
            case "+":
            System.out.println("--Pertambahan--");
            System.out.println("Masukkan Nilai Pertama ");
            Integer nilai1 = keyboard.nextInt();
            System.out.println("Masukkan Nilai Kedua");
            Integer nilai2 = keyboard.nextInt();
            System.out.println("Hasil = ");
            pertambahan(nilai1, nilai2);
                break;
            case "-":
            System.out.println("--Pengurangan--");
            System.out.println("Masukkan Nilai Pertama ");
            Integer nilai1min = keyboard.nextInt();
            System.out.println("Masukkan Nilai Kedua");
            Integer nilai2min = keyboard.nextInt();
            System.out.println("Hasil = ");
            pengurangan(nilai1min, nilai2min);
                break;
            case "*":
            System.out.println("--Perkalian--");
            System.out.println("Masukkan Nilai Pertama ");
            Integer nilai1kali = keyboard.nextInt();
            System.out.println("Masukkan Nilai Kedua");
            Integer nilai2kali = keyboard.nextInt();
            System.out.println("Hasil = ");
            perkalian(nilai1kali, nilai2kali);
                break;
            case "/":
            System.out.println("--Pembagian--");
            System.out.println("Masukkan Nilai Pertama ");
            Integer nilai1bagi = keyboard.nextInt();
            System.out.println("Masukkan Nilai Kedua");
            Integer nilai2bagi = keyboard.nextInt();
            System.out.println("Hasil = ");
            pembagian(nilai1bagi, nilai2bagi);
                break;
            case "%":
            System.out.println("--Modulus--");
            System.out.println("Masukkan Nilai Pertama ");
            Integer nilai1mod = keyboard.nextInt();
            System.out.println("Masukkan Nilai Kedua");
            Integer nilai2mod = keyboard.nextInt();
            System.out.println("Hasil = ");
            modulus(nilai1mod, nilai2mod);
                break;
            default:
                System.out.println("Operasi tidak ditemukan");
                break;
        }
    }

    static void pertambahan(int nilai1, int nilai2){
        System.out.println(nilai1 + nilai2);
        System.out.println("--terimakasih--");
    }
    static void pengurangan(int nilai1, int nilai2){
        System.out.println(nilai1 - nilai2);
        System.out.println("--terimakasih--");
    }
    static void perkalian(int nilai1, int nilai2){
        System.out.println(nilai1 * nilai2);
        System.out.println("--terimakasih--");

    }
    static void pembagian(int nilai1, int nilai2){
        System.out.println(nilai1 / nilai2);
        System.out.println("--terimakasih--");
    }
    static void modulus(int nilai1, int nilai2){
        System.out.println(nilai1 % nilai2);
        System.out.println("--terimakasih--");
    }

}
