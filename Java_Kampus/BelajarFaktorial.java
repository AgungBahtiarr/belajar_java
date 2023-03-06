/**
 * BelajarFaktorial
 */
public class BelajarFaktorial {

    public static int faktorialIteratif(int n) {
        if (n<0){
            return -1;
        }else if (n>1) {
            int faktorial = 1;
            for (int i = n; i >0; i--) {
                faktorial *=i;
            }
            return faktorial;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hasilnya adalah " +faktorialIteratif(5));
    }
}