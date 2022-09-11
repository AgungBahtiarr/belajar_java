package Java_Dasar;
public class if_else_else_if_statement {
    public static void main(String[] args) {
        var nilai = 65;
        var absen = 65;

        if(nilai >= 70 && absen >= 65){
            System.out.println("Lulus");
        }else if( nilai >=65 && absen >= 65){
            System.out.println("Anda Remidi");
        }else{
            System.out.println("Anda Gagal");
        }
    }
}
