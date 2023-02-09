public class whileAndDoWhile {
    public static void main(String[] args) {
        var nilai=1;
        while(nilai<=100){
            System.out.println(nilai);
            nilai++;
        }


        char letter = 'A';

        while (letter<='Z') {
            System.out.print(letter);
            letter++;
        }

        var angka = 0;

        do{
            System.out.println(angka);
            angka++;
        }while(angka<=100);
    }
}
