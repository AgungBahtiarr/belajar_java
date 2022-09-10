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
            System.out.println(nilai1 + nilai2);
                break;
            case "-":
            System.out.println("--Pengurangan--");
                break;
            case "*":
            System.out.println("--Perkalian--");
                break;
            case "/":
            System.out.println("--Pembagian--");
                break;
            case "%":
            System.out.println("--Modulus--");
                break;
            default:
                break;
        }
    }

}
