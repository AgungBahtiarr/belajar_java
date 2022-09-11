package Java_Dasar;
public class foreach {
    public static void main(String[] args) {
        //for 
    String[] array1 = {"agung", "hadi", "daniel"
    };

    for(var i = 0; i<array1.length;i++){
        System.out.println(array1[i]);
    }

    //for each lebih simple
    for(var value : array1){
        System.out.println(value);
    }
    }
}
