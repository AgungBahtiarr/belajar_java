public class faktorialRekursi {
    public static int faktorialRekursif(int n) {
        if (n==0) {
            return 1;
        }else{
            return n * faktorialRekursif(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
    }
}
