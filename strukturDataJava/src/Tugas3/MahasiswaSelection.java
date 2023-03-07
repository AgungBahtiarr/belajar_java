package Tugas3;

public class MahasiswaSelection{

    public static String[] nama = {"Agung", "Rifki", "Falen", "Adam", "Ade", "Riza","Oscar"};

    public static void selectionSortAscending(String[] dataArray) {
        //Logic
        for (int i = 0; i < dataArray.length; i++) {
            
            int indexArray = i;
            for (int j = i; j < dataArray.length; j++) {
                if (dataArray[indexArray].compareTo(dataArray[j]) > 0) {
                    indexArray = j;
                }
            }
            //Swap
            String tampungan = dataArray[i];
            dataArray[i] = dataArray[indexArray];
            dataArray[indexArray] = tampungan;
        }
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println("Nama : " + dataArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sebelum di sorting: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+" ");
        }
        System.out.println("\nSesudah disorting: ");
        selectionSortAscending(nama);
    }
}
