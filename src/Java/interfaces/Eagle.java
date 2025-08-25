package Java.interfaces;

public class Eagle implements Bird, LivingThing{
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
        System.out.println(e.canBreath());
    }
}
