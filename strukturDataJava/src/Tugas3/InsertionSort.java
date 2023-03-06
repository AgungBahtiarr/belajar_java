package Tugas3;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = {1,6,2,7,3,8};

        System.out.println("====Ascending====");
        insertionSortAscending(test);
        System.out.println("\n====Descending====");
        insertionSortDesscending(test);
    } 

    public static void insertionSortAscending(int[] dataArray){
        System.out.println("Sebelum di urutkan");
        for(int b:dataArray){
            System.out.print(b+", ");
        } 

        //Logic Ascending
        for (int i = 1; i < dataArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if(dataArray[j] < dataArray[j-1]){
                    int tampungan = dataArray[j];
                    dataArray[j] = dataArray[j-1];
                    dataArray[j-1] = tampungan;
                }
            }
        }
        System.out.println("\nSesudah di urutkan");
        for(int b:dataArray){
            System.out.print(b+", ");
        } 
    }

    public static void insertionSortDesscending(int[] dataArray){
        System.out.println("Sebelum di urutkan");
        for(int b:dataArray){
            System.out.print(b+", ");
        } 

        //Logic Ascending
        for (int i = 1; i < dataArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if(dataArray[j] > dataArray[j-1]){
                    int tampungan = dataArray[j];
                    dataArray[j] = dataArray[j-1];
                    dataArray[j-1] = tampungan;
                }
            }
        }
        System.out.println("\nSesudah di urutkan");
        for(int b:dataArray){
            System.out.print(b+", ");
        } 
    }


}
