public class ConstructorPractice extends Construct {
    int id;
    String name;
    /*ConstructorPractice(){
        System.out.println("Constructor called");
    }*/
    ConstructorPractice(int id,String name){
        super();
        this.id = id;
        this.name = name;
        /*this(3,"Jana");*/
    }
    public void displayInfo(){
        System.out.println("ID:"+id+"\nName:"+name);
    }
    public static void main(String[] args) {
        /*ConstructorPractice constructorPractice = new ConstructorPractice();*/
        ConstructorPractice constructorPractice;
        constructorPractice = new ConstructorPractice(1,"Jana");
        constructorPractice.displayInfo();
        System.out.println(new ConstructorPractice(2,"Raj"));
        /*System.out.println(id); -- gives compile time error as we can't access non static members,methods from static method*/
        /*displayInfo();       -- gives compile time error as we can't access non static members,methods from static method*/

    }
}

class Construct{
    Construct(){
        System.out.println("Construct constructor");
    }
}