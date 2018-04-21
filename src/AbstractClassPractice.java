public class AbstractClassPractice extends Shape {
    public static void main(String[] args) {
        /*Shape shape = new Shape(); can't create object for abstract class*/
                AbstractClassPractice classPractice = new AbstractClassPractice(20);
                classPractice.print2();
                classPractice.print();
                new AbstractClassPractice(20);
                new AbstractClassPractice(1).print();
        System.out.println(classPractice.x);
                classPractice.x = 21;
        System.out.println(classPractice.x);
    }
    void print2(){
        System.out.println("print2 of Shape");
    }
    AbstractClassPractice(int i){
        System.out.println("parametrized consturctor of class");
    }
}

abstract class Shape implements tempInterface1 {
    int x = 20;
    Shape(){
        System.out.println("constructor of abstract class"+a);
    }
    int a = 21;
    void print(){
        System.out.println("print of Shape"+a);
    }
    abstract void print2();
}

interface tempInterface1{
    int a =10;
}