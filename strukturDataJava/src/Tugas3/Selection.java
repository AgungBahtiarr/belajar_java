package Tugas3;

public class Selection {
    // public static <T extends Comparable<? super T>> void
    // selectionSort(T[] arr) {
    // T temp;
    // for(int i=arr.length-1 ; i>=0 ; i--){
    //     int max = i;
    //     for(int j=i-1 ; j>=0 ; j--){
    //         if(arr[j].compareTo(arr[max]) > 0)
    //             max = j;
    //         }
    //         temp = arr[i];
    //         arr[i] = arr[max];
    //         arr[max] = temp;
    //     }
    // }
    // public static <T> void tampil(T data[]) {
    // for (T objek : data){
    //     System.out.print(objek + " ");
    // }
    //     System.out.println("");
    // }

    //Descending

    public static <T extends Comparable<? super T>> void
    selectionSortDesc(T[] arr) {
    T temp;
    for(int i=arr.length-1 ; i>=0 ; i--){
        int max = i;
        for(int j=i-1 ; j>=0 ; j--){
            if(arr[j].compareTo(arr[max]) < 0)
                max = j;
            }
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    public static <T> void tampilDesc(T data[]) {
    for (T objek : data){
        System.out.print(objek + " ");
    }
        System.out.println("");
    }

    public static void main(String[] args) {
    Integer data[] = new Integer[10];
    for(int a=0 ; a<data.length ; a++){
        data[a]= (int)(Math.random()*13+1);
    }
    long awal = System.currentTimeMillis();
    System.out.println("Ini Descending");
    selectionSortDesc(data);
    long sisaWaktu = System.currentTimeMillis() - awal;
    tampilDesc(data);
    System.out.println("Waktu " + sisaWaktu);
    // System.out.println("Ini Descending");
    // selectionSortDesc(data);
    // tampil(data);
    }
}