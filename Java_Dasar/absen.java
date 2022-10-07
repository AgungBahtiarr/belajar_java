package Java_Dasar;
import java.util.Scanner;

public class absen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] daftarabsen={
            "agung", "riski", "rafi", "fikron", "malik", "hadi", "ilham"
        };
    
        for(var i =0;i < daftarabsen.length; i++){
            // System.out.println(daftarabsen[i]);
            String isiabsen = daftarabsen[i];
            var inputnama = scan.nextLine();
            if ( inputnama == isiabsen ){
                System.out.println("hadir");
                break;
            }else{
                System.out.println("salah kelas");
            }
        }
        scan.close();
    }
}

