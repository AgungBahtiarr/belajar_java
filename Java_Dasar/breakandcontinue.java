package Java_Dasar;
public class breakandcontinue {
    /**
     * @param args
     */
    public static void main(String[] args) {
        var nilai = 1;
        while (true) {
            System.out.println("gas");
            nilai++;
            if(nilai>=20){ //jika nilai lebih dari sama dengan 20 maka break;
                break;
            }
        }

        for(var angka = 1;angka<=100;angka++){
            if(angka % 2 == 0){ //artinya hentikan  perulangan ke bawah lanjutkan ke perulangan selanjutnya
                continue;
            }
            System.out.println(angka);
        }
    }
}
