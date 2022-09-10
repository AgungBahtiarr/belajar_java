

public class recursivemethod {
    public static void main(String[] args) {
        System.out.println(factorialrecursive(5));
    }

    static int factorialrecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialrecursive(value-1);
        }
    }
}
