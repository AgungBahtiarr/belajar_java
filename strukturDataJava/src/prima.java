public class prima {
    public static void main(String[] args) {
        Integer[] array = {23,6,47,35,2,14};
        System.out.print("Data yang merupakan bilangan prima: "); 
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
