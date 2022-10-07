package Java_Oop;

/**
 * PersonApp
 */
public class PersonApp {

    public static void main(String[] args) {
        var person1 = new Person("agung","banyuwangi");

        person1.name="agung";
        person1.address="banyuwangi";
        //memanggil class biasa
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // memanggil method
        person1.sayHello("agung");
        Person person2 = new Person("agung", "kalibaru");
        Person person3;
        person3 = new Person("agung", "kalibaru");

    }
}