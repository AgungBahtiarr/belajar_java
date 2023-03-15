public class MergeSort {
    static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l +i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[m + 1 +j];
        }   
        int i = 0, j=0;
        int k = l;

        while (i < n1 && j <n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

     static void mergeSort(int arr[], int l, int r){
        if (l < r) {
            int m = l + (r-l) / 2;

            mergeSort(arr , l , m);
            mergeSort(arr , m + 1, r);

            merge(arr, l, m, r);
        }
        // printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arrayku = {8,6,2,7,1};
        int n = arrayku.length;
        mergeSort(arrayku, 0, n-1);
        System.out.println("Hasil");
        printArray(arrayku);
    }
}
