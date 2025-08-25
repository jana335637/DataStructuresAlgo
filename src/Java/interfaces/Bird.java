package Java.interfaces;

public interface Bird extends LivingThing {
    default void fly(){
        System.out.println("Bird is flying");
    }
}
