package Java_Dasar;
public class method {
    public static void main(String[] args) {
        heloo(); //memanggil method di bawah
        yok("agung", "bahtiar"); //masukkan parameter nya 
        var a = 100;
        var b = 200;
        var c = sum(a,b); // method dari sum
        System.out.println(c);

        Double alas = 18.0;
        Double tinggi = 30.0;
        System.out.println(luassegitiga(alas,tinggi));

        Double jari2 = 19.0;
        System.out.println(luaslingkaran(jari2)); 
    }

    static void heloo(){
        System.out.println("hello world");
    }

    // method parameter

    static void yok(String namawal, String namaakhir){
        System.out.println("haloo" + " " + namawal + namaakhir);
    }


    //method return value

    static int sum(int value1, int value2 /*ingat2 penulisan value*/){
        var total = value1 + value2; //ini yang akan di lakukan method
        return total; //return
    }


    static Double luassegitiga(Double alas, Double tinggi){
        Double hasil = (alas * tinggi) / 2;
        return hasil;
    }


    static Double luaslingkaran(Double jari2){
        Double hasill = 3.14 * jari2 *  jari2;
        return hasill;
    }
}
