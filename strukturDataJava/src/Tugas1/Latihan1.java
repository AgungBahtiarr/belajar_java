package Tugas1;
import java.util.Arrays;
public class Latihan1 {
    public static void main(String[] args) throws Exception {
        Integer[] array = {23,6,47,35,2,14};

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }


        // rata2
        var simpan = 0;
        for (int i = 0; i < array.length; i++) {
            simpan += array[i];
        }
        
        System.out.println("\n Rata-ratanya adalah = "+simpan/array.length);


        int max=array[0];
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }else if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);

        System.out.println("\nIni nilai ganjil");
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 != 0){
                System.out.print(" " + array[i] );
            }
        }

        System.out.print("\nData yang merupakan bilangan prima: "); 
        for (int i = 0; i < array.length; i++) { 
           boolean isPrime = true; 
           for (int j = 2; j < array[i]; j++) { 
              if (array[i] % j == 0) { 
                 isPrime = false; 
                 break; 
              } 
           } 
           if (isPrime && array[i] > 1) { 
              System.out.print(array[i] + " "); 
           } 
        }
}
}
