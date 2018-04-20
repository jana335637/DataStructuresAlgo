/**
 * Created by pillutja on 3/20/2018.
 */
public class Deadlock {
    public static void main(String[] args) {
        final String resource1 = "Jana";
        final String resource2 = "Raj";
        Thread t1 =new Thread(){
            public  void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {e.printStackTrace();}
                }

                synchronized (resource2){
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        };
        Thread t2 =new Thread(){
            public  void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");

                }

                synchronized (resource1){
                    System.out.println("Thread 2: locked resource 1");
                }

            }
        };
        t1.start();
        t2.start();
    }
}
