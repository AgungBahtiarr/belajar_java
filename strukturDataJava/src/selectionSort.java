public class selectionSort {
    public static void main(String[] args) {
        selectionSort sselectionSort = new selectionSort();

        int data[] = {8,7,6,5,4,3,2,1};

        sselectionSort.tampil(data);

        long awal = System.currentTimeMillis();
        for (int i = 0; i < data.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j]< data[min]){
                    min = j;
                }
            }

            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;

            System.out.println("Index ke " + i + " dan index ke "+ min);

            sselectionSort.tampil(data);
        }

        long waktu  = System.currentTimeMillis()-awal;
        System.out.println("Waktu yang di perlukan untuk sorting : " + waktu + "ms");
        System.out.println("Hasil akhir ");
        sselectionSort.tampil(data);
    }

    void tampil(int []data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
