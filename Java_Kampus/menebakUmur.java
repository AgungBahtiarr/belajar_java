import java.util.Scanner;
public class menebakUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        System.out.println("Masukkan sisa bagi 3 umur anda...");
        int s1 = scanner.nextInt();
        System.out.println("Masukkan sisa bagi 5 umur anda...");
        int s2 = scanner.nextInt();
        System.out.println("Masukkan sisa bagi 7 umur anda...");
        int s3 = scanner.nextInt();
        int umur = ((s1 * 70) + (s2 * 21) + (s3 * 15)) % 105;
        System.out.println("Umur anda adalah...");
        System.out.println(umur);

        scanner.close();
    }
}
