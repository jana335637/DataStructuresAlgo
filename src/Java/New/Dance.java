package Java.New;

import Java.Other.A;

public class Dance extends A {
    int x;
    private Dance(){
        super("HI");
        x=6;
    }
    public static void main(String[] args) {
        Dance d = new Dance();
        System.out.println(d.x);
        /*A a =new A("s");*/
    }
}
