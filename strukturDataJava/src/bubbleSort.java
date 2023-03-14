public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,6,5,8,3};

        System.out.println("Sebelum");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int n = arr.length;
        int posAkhir = n - 2;
        int indexArray = 0;
        int l = 1;

        while (posAkhir > 0) {
            indexArray = 0;

            // Print untuk outer perulangan
            System.out.println("Perulangan ke "+l);

            while (indexArray<=posAkhir) {
                if (arr[indexArray]>arr[indexArray+1]) {
                    int temp = arr[indexArray];
                    arr[indexArray] = arr[indexArray+1];
                    arr[indexArray+1] = temp;
                }
                indexArray++;

                // Print setiap inner perulangan
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+", ");
                }
                System.out.println("");
            }
            posAkhir--;

            l++;
        }

        System.out.println("\n Sesudah");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
