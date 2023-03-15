public class QuickSort {

    public static int partition(int arr[], int low,int high) {
        int pivot = arr[high];
        int i = (low-1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    public static void quickSort(int arr[],int low , int high){
        int pi;
        if (low < high) {
            pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arrayku = {5,3,6,4,7,2,1,8};
        int n = arrayku.length -1;
        quickSort(arrayku, 0, n);
        printArray(arrayku);
    }
    
}
