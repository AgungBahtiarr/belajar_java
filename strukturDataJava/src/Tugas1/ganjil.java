package Tugas1;
public class ganjil {
    public static void main(String[] args) {
        Integer[] array = {23,6,47,35,2,14};
        System.out.println("Ini nilai ganjil");
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 != 0){
                System.out.print(" " + array[i] );
            }
        }
    }
}
