import java.io.IOException;

public class dOG extends Animal {
    public void callme(){
        System.out.println("callme In class dog");
    }
    public void callme2(){
        System.out.println("callme2 In class dog");
    }
    public static void main(String[] args) {
        dOG d1= new dOG();
        Animal d2 =new Animal();
        Animal d3 = new dOG();
        dOG d4 = null;
        //dOG d5 = (dOG) new Animal(); Run time error - ClassCaseException
        System.out.println(d1 instanceof Animal);
        System.out.println(d2 instanceof dOG);
        System.out.println(d3 instanceof dOG);
        System.out.println(d4 instanceof dOG);
        System.out.println(d3 instanceof Animal);
        if(d3 instanceof dOG)
        {
            dOG d6=(dOG)d3;
            d6.sound();
        }
        downcast(d2);
        downcast(d3);
        downcast(d1);
        //System.out.println(d5 instanceof Animal);
        char[] s = {'1','2'};
        System.out.println(new String(s));
        System.out.println(new String(s.toString()));
        System.out.println(s.toString());
        try{
//                                             m();
        }
        catch(Exception e)
        {
            System.out.println("Caught");
        }   finally {
            System.out.println("finally");
        }
        System.out.println("Regular Flow");
    }
    public static void downcast(Animal a){
        if(a instanceof dOG)
        ((dOG)a).callme2();
    }
    public static void m() throws IOException {
        try {
            n();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void n() throws IOException {
                          throw new IOException();
    }
}

class Animal{
    public void sound(){
        System.out.println("Animal talking");
    }
    public void callme(){
        System.out.println("call me in Animal");
    }
}