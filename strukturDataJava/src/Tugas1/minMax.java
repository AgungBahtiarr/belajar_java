package Tugas1;
public class minMax {
    public static void main(String[] args) {
        Integer[] array = {23,6,47,35,2,14};
        
        int max=array[0];
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }else if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);
    }
}
