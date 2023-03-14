public class shellShort {
    public static void shellShortM(int arr[]) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap/=2) {
            for (int i = gap; i < n; i+=1) {
                int temp = arr[i];
                
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j-=gap) {
                    arr[j] = arr[j-gap]; 
                }
                arr[j] = temp;  
                
            }
        }

        System.out.println("Hasil");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }
    }
    public static void main(String[] args) {
        int[] arrayku = {1,5,7,3,8};
        shellShortM(arrayku);
    }
}
