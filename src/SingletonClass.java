public class SingletonClass {

    private static SingletonClass singletonObject=null;
    public String s;
    private SingletonClass(){
        s="This is a singleton class";
    }

    public static SingletonClass getSingletonObject() {
        if(singletonObject==null)
            singletonObject = new SingletonClass();
        return singletonObject;
    }
}
class Main{
    public static void main(String[] args) {

        SingletonClass x = SingletonClass.getSingletonObject();
        SingletonClass y = SingletonClass.getSingletonObject();
        SingletonClass z = SingletonClass.getSingletonObject();
        x.s=x.s.toUpperCase();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
        x.s=x.s.toLowerCase();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
    }
}