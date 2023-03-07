package Tugas3;

public class MahasiswaInsertion {
    public static String[] nama = {"Agung", "Rifki", "Falen", "Adam", "Ade", "Riza","Oscar"};

    public static void insertionSortAscending(String[] dataArray){
        System.out.println("Sebelum di urutkan");
        for(String b:dataArray){
            System.out.print(b+" ");
        } 

        //Logic Ascending
        for (int i = 1; i < dataArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if(dataArray[j].compareTo(dataArray[j-1]) < 0){
                    String tampungan = dataArray[j];
                    dataArray[j] = dataArray[j-1];
                    dataArray[j-1] = tampungan;
                }
            }
        }
        System.out.println("\nSesudah di urutkan");
        for(String b:dataArray){
            System.out.print(b+" ");
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        insertionSortAscending(nama);
    }
}
