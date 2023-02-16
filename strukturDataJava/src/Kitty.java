class Kitty {
    int kittyAge;

    public Kitty(String name){
        System.out.println("Passed name is : " + name);
    }

    public int setAge(int age){
        kittyAge = age;
        return kittyAge;
    }

    public int getAge(){
        System.out.println("Kitty age is : " + kittyAge);
        return kittyAge;
    }

    public static void main(String[] args) {
        Kitty myPus =  new Kitty("Owi");
        myPus.setAge(2);
        myPus.getAge();

        System.out.println("Variable Value : "+ myPus.kittyAge);
    }
}

