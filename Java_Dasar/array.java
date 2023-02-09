package Java_Dasar;
/**
 * array
 */
public class array {

    public static void main(String[] args) {
        Integer[] dataharga;
        dataharga = new Integer[5];
        dataharga[0] = 1000;
        dataharga[1] = 2000;
        dataharga[2] = 5000;

        System.out.println(dataharga[2]);
    

        // array initializer
        Integer[] arrayint = new Integer[]{
            10,11,12,15,25,25
        };
        System.out.println(arrayint[2]);

        String[] arraystring = new String[]{
            "agung", "bahtiar", "fikron", "maulana"
        };
        System.out.println(arraystring[2]);
        //simple array
        int[] intsimple={
            1, 2, 3
        };
        System.out.println(intsimple[1]);
        // mengambil data di array
        // array[index] // mengambil data di array
        // array[index] = value // mengubah data di array
        // array.lenght //mengambil panjang array
        System.out.println(intsimple.length);

        // mengubah nilai array menjadi null / 0
        intsimple[0] = 0;
        arraystring[0] = null;

        //array di dalam array

        String[][] member = {
            {"agung" , "fikron"},
            {"malik", "ilham"}
        };
        System.out.println(member[1][0]); //kotak pertama array pertama //kotak ke2 array di dalam array pilihan kotak pertama
        System.out.println(member.length);
        
    }

}