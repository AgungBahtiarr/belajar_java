public class InterPolationSearch {
    public static int interpolation(int arr[], int lo, int hi, int x) {
	int pos;

    if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
		pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
 
		// Condition of target found
		if (arr[pos] == x)
	        return pos;
 
		// If x is larger, x is in right sub array
		if (arr[pos] < x)
			return interpolation(arr, pos + 1, hi, x);
		// If x is smaller, x is in left sub array
		if (arr[pos] > x)
			return interpolation(arr, lo, pos - 1, x);
	}
	return -1;
    }

    public static void main(String[] args){
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
     
        int n = arr.length;
     
        // Element to be searched
        int x = 18;
        int index = interpolation(arr, 0, n - 1, x);
     
        // If element was found
        if (index != -1)
            System.out.println("Element found at index "+ index);
        else
            System.out.println("Element not found.");
    }
}
