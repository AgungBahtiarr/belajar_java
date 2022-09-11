package Java_Dasar;
public class operasi_mtk {
    public static void main(String[] args) {
        int tahunlahir = 2002;
        int tahunini = 2022;
        var umur = tahunini - tahunlahir;
        System.out.println(umur);

        int harga1 = 2000;
        int harga2 = 2000;
        var total = harga1 + harga2;
        System.out.println(total);


        //augmented Assingments
        tahunini = tahunini + 10;
        System.out.println(tahunini);
        //bisa disingkat
        tahunini += 10;
        System.out.println(tahunini);
        //dst

        //unary operator ++(naik 1) --(turun 1) +(positive) -(negative) !(boolean kebalikan)
        tahunini++;
        System.out.println(tahunini); 
    }
}
