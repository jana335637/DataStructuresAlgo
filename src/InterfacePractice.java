public class InterfacePractice extends tempClass implements tempInterface, tempInterface2 {
    public static void main(String[] args) {
        /*temp = 1; by default all members of interface are static and final, so gives compilation error*/
    tempInterface tempObject = new InterfacePractice();
    tempObject.print();
    tempObject.show();
    tempInterface.write();
    }
    public void print(){
        System.out.println("Print of Practice");
    }
}

interface tempInterface{
    short temp = 0;
    //void printStack();
    void print();
    /*default and static methods are allowed in interface from Java 8, We need to call static method as Interface.staticMethod()*/
    default void show(){
        System.out.println("show method of interface");
    }
    static void write(){
        System.out.println("write method of Interface");
    }
}

interface tempInterface2{
    void print();
}

class tempClass{
    void print(){
        System.out.println("print of tempClass");
    }
}

class tempClass1{
    void print(){
        System.out.println("print of tempClass1");
    }
}