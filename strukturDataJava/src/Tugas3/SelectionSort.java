package Tugas3;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {34,5,63,3,68,5,3};
        System.out.println("===Ascending===");
        selectionSortAscending(myArray);
        System.out.println("\n===Descending===");
        selectionSortDescending(myArray);

    }

    public static void selectionSortAscending(int[] dataArray) {
        System.out.println("Sebelum Di urutkan");

        for(int dA : dataArray){
            System.out.print(dA + ", ");
        }

        //Logic
        for (int i = 0; i < dataArray.length; i++) {
            
            int indexArray = i;
            for (int j = i; j < dataArray.length; j++) {
                if (dataArray[indexArray] > dataArray[j]) {
                    indexArray = j;
                }
            }
            //Swap
            int tampungan = dataArray[i];
            dataArray[i] = dataArray[indexArray];
            dataArray[indexArray] = tampungan;
        }

        System.out.println("\nSesudah Di urutkan");

        for(int dA : dataArray){
            System.out.print(dA + ", ");
        }
    }

    public static void selectionSortDescending(int[] dataArray) {
        System.out.println("Sebelum Di urutkan");

        for(int dA : dataArray){
            System.out.print(dA + ", ");
        }

        //Logic
        for (int i = 0; i < dataArray.length; i++) {
            
            int indexArray = i;
            for (int j = i; j < dataArray.length; j++) {
                if (dataArray[indexArray] < dataArray[j]) {
                    indexArray = j;
                }
            }
            //Swap
            int tampungan = dataArray[i];
            dataArray[i] = dataArray[indexArray];
            dataArray[indexArray] = tampungan;
        }

        System.out.println("\nSesudah Di urutkan");

        for(int dA : dataArray){
            System.out.print(dA + ", ");
        }
    }
}
