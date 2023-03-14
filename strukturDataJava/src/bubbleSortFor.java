public class bubbleSortFor {
    public static void bubbleSort(int arr[]){
        System.out.println("Sebelum");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Hasil");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] arrayku = {6,5,4,7,1,10,43,21};
        bubbleSort(arrayku);
        
    }
}
