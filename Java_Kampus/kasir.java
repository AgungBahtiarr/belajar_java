package Java_Kampus;

public class kasir {
    public static void main(String[] args) {
        double hargaBeli = 19.93;
        double hargaBayar = 20.00;
        double hargaKembali = hargaBayar-hargaBeli;
        float hargaKembali2 = (float) hargaKembali; 
        System.out.println(hargaKembali2);
    }
}
