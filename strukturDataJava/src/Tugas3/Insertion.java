package Tugas3;

public class Insertion {
//     public static <T extends Comparable<? super T>> void insertionSort(T[] arr){
//     for (int i=arr.length-1 ; i>=0 ; i--) {
//         for (int j = i+1, k = i; j <arr.length ; j++){
//             if (arr[j].compareTo(arr[k]) > 0) {
//                 break;
//             } else {
//                 T temp = arr[k];
//                 arr[k] = arr[j];
//                 arr[j] = temp;
//                 k = j;
//             }
//         }
//     }
// }
//     public static <T> void tampil(T data[]) {
//         for (T objek : data) {
//             System.out.print(objek + " ");
//         }
//             System.out.println("");
//         }

        public static <T extends Comparable<? super T>> void insertionSortDesc(T[] arr){
            for (int i=arr.length-1 ; i>=0 ; i--) {
                for (int j = i+1, k = i; j <arr.length ; j++){
                    if (arr[j].compareTo(arr[k]) < 0) {
                        break;
                    } else {
                        T temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                        k = j;
                    }
                }
            }
        }

        public static <T> void tampilDesc(T data[]) {
            for (T objek : data) {
                System.out.print(objek + " ");
            }
                System.out.println("");
            }
    
    
    public static void main(String[] args) {
        Integer data[] = new Integer[10];
        for(int a=0 ; a<data.length ; a++){
            data[a]= (int)(Math.random()*20+1);
        }

        // Ascending
        System.out.println("Ini Descending");
        long awal = System.currentTimeMillis();
        insertionSortDesc(data);
        long sisaWaktu = System.currentTimeMillis() - awal;
        tampilDesc(data);
        System.out.println("Waktu " + sisaWaktu);
        // // Descending
        // System.out.println("Ini Descending");
        // insertionSortDesc(data);
        // tampil(data);
        // System.out.println("Waktu " + sisaWaktu);
    }
}

