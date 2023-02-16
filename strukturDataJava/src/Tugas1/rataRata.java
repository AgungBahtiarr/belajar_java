package Tugas1;
public class rataRata {
    public static void main(String[] args) {
        Integer[] array = {23,6,47,35,2,14};
        var simpan = 0;
        for (int i = 0; i < array.length; i++) {
            simpan += array[i];
        }
        
        System.out.println("Rata-ratanya adalah = "+simpan/array.length);
    }
}
