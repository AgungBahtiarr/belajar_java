/**
 * terrnary
 */
public class terrnary {

    public static void main(String[] args) {
        var nilai = 90;
        String ucapan;

        if (nilai <=70){
            ucapan = "Anda gagal";
            System.out.println(ucapan);
        } else{
            ucapan = "anda lulus";
            System.out.println(ucapan);
        };

        //terrnary
        String ucapann = nilai > 75 ? "anda lulus" : "Silahkan Coba lagi"; // ? if : else
        System.out.println(ucapann);

    }
}