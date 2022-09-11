package Java_Dasar;
public class methodoverloading {
    public static void main(String[] args) {
        //menggunakan nama method berulangkali, namu menggunakan parameter yang berberda
        sayhello();
        sayhello("agung");
        sayhello("agung", "bahtiar");
    }

    static void sayhello(){
        System.out.println("hello world");
    }

    static void sayhello(String firstname){
        System.out.println("helloworld");
    }

    static void sayhello(String firstname, String lastnsme){
        System.out.println("hello world");
    }
}
