import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        
        Integer[] array = {23,6,47,35,2,14};

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
