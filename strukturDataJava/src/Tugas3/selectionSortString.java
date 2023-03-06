package Tugas3;

public class selectionSortString {
    public static void main(String[] args) {
        String[] myArray = {"a","f","l","d"};
        System.out.println("===Ascending===");
        selectionSortAscending(myArray);

    }

    public static void selectionSortAscending(String[] dataArray) {
        System.out.println("Sebelum Di urutkan");

        for(String dA : dataArray){
            System.out.print(dA + ", ");
        }

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

        System.out.println("\nSesudah Di urutkan");

        for(String dA : dataArray){
            System.out.print(dA + ", ");
        }
    }
}
