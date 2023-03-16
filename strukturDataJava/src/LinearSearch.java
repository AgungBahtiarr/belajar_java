public class LinearSearch {
    public static int search(int[] arr, int x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayku =  {5,6,3,1,8,2};
        int x = 8;

        int result = search(arrayku, x);
        if(result == -1){
            System.out.println("Tidak ada");
        }else{
            System.out.println("Elemen ada pada index "+ result);
        }
    }
}

