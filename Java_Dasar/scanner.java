package Java_Dasar;
import java.util.Scanner; 
public class scanner {
   public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);

    String var1 = masuk.nextLine();
    String var2 = masuk.nextLine();

    String tes1="agung";
    String tes2="agung";

    //string cek
    boolean cek = var1.equals(var2);
    System.out.println(cek);

    boolean cek2 = tes1 == tes2;
    System.out.println(cek2);
    masuk.close();
   }
}
