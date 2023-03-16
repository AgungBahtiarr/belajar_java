public class BinarySearch {
    public static int binarySearchIteratif(int[] arr , int low, int high, int x){
        for (int i = 0; i < arr.length; i++) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            }else if (x>arr[mid]) {
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }



    int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
 
			if (arr[mid] == x)
                return mid;
 
			if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
 
			return binarySearch(arr, mid + 1, high, x);
        }
		return -1;
    }

    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int[] arrayku = {2,3,4,5,6,7};
        int o = arrayku.length - 1;

        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);


        int resultIteratif = binarySearchIteratif(arrayku, 0, o, 7);
        System.out.println("Ketemu Pada index ke " + resultIteratif);
        }
    }





    // binarySearch(arr, x, low, high)
	// repeat till low = high
	// 	mid = (low + high)/2
		
	// 	if (x == arr[mid])
	// 		return mid
   
	// 	else if (x > arr[mid])
	// 		// x is on the right side
	// 		low = mid + 1
   
	// 	else
	// 		// x is on the left side
	// 		high = mid - 1

