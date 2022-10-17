package Java_Oop;

class Person {
    String name;
    String address;
    final String country = "indonesia";
    // ini contractor, bisa di overloading,contoh pertama pake parameter yang ke dua enggak
    Person(String paramname,String paramaddress){
        name = paramname;
        address = paramaddress;
        
    }
    // ini contoh
    Person(){
        
    }
    void sayHello(String paramname){
        System.out.println("Hello " + paramname + ", my name is " + name);
        // membuat method, void = method yang tidak untuk mengembalikan nilai/ return
    }
}
