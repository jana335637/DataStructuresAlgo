package Java.Other;

public class A {
    protected A(String s){
        System.out.println("Hi "+s);
        setA();
    }
    private final void setA(){
        System.out.println("A final");
    }
}
class B  extends  A{
    B(){
        super("Jana");
    }

    public static void main(String[] args) {
/*
        B b = new B();
        A a = new B();
        b.setA();
*/
        //B b = new A("a");
        System.out.println("B main");
    }
    private final void setA(){
        System.out.println("B final");
    }
    static {
        System.out.println("B static block");
    }
}
class E {
    protected E(){
        System.out.println("E protected const");
    }
    static void Sing(){
        System.out.println("E sing");
    }
    void dance(){
        System.out.println("E dance");
    }
}
class F {
    static void Sing(){
        System.out.println("F sing");
    }
    public void dance(){
        System.out.println("F dance");
    }
    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        e.Sing();
        f.Sing();
        e.dance();
        f.dance();
    }
}