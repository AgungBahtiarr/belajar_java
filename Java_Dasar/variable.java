package Java_Dasar;
public class variable {
    public static void main(String[] args) {
        String name; //jika tidak ingin memasukkan value langsung
        name = "Agung Bahtiar";
        System.out.println(name);
        int age = 30;
        String address = "indonesia";
        System.out.println(age);
        System.out.println(address);

        // update variable
        name = "Hadi Setyo Prayogo";
        System.out.println(name);

        // sejak java  10 , mendukung penggunaan var
        var variable = "var";
        System.out.println(variable);
        var umur = 17;
        System.out.println(umur);
        var inifloat = (float) 50;
        System.out.println(inifloat);
        var inibyte = (byte) 124;
        System.out.println(inibyte);
        var tambah2string = "Agung" + " " + "Bahtiar";
        System.out.println(tambah2string);  
        //variable final tidak bisa di ubah / konstant
        final String turu = "hayuukk";
        System.out.println(turu);
        // turu = "turu"; tidak bisa di ubah
        
    }


}
