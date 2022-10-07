package Java_Dasar;
public class nilaiMin {
    public static void main(String[] args) {
        int [] bilangan = {2,5,12,1,4};
        int perbandingan=100;
        for(int value:bilangan){
            if(value<perbandingan){
                perbandingan=value;
                System.out.println(perbandingan);
            }
        }
    }
}
