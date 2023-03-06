package Tugas3;

public class Mahasiswa{

    public static String[] nama = {"Agung", "Rifki", "Falen", "Adam", "Ade", "Riza"};
    public static Integer[] nrp = {1223,12344,2344,4556,6677,7890};

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
            System.out.println("Nama : " + dataArray[i] + "NRP : "+nrp[i]);
        }
    }
    
    public static void main(String[] args) {
        selectionSortAscending(nama);
    }
}
