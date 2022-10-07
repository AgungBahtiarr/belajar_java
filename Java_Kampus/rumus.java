package Java_Kampus;
import java.util.Scanner;
public class rumus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka pertama...");
        Integer a = input.nextInt();
        System.out.println("masukkan angka kedua...");
        Integer b = input.nextInt();
        System.out.println("masukkan angka ketiga...");
        Integer t = input.nextInt();

        if(a!=0&&b!=0&&t!=0){
            Integer hitung1 = (a + b) * t;
            Integer hitung2 = 2*(1-t);
            Integer total = hitung1 / hitung2;
            System.out.println("Hasilnya adalah...");
            System.out.println(total);
        }else{
            System.out.println("tidak boleh ada nol");
        }
        input.close();
    }
}
