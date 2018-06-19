import java.util.concurrent.atomic.AtomicInteger;
/**
 * Created by pillutja on 3/20/2018.
 */
public class Deadlock {
    public static void main(String[] args) {
        final String resource1 = "Jana";
        final String resource2 = "Raj";
        Thread t3 = new Thread() {
            public void run() {
                System.out.println("Thread 3");
            }
        };

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                    try{
                        Thread.sleep(10000);
                    }catch (Exception e){}
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }

            }
        };
        Test test = new Test();
        System.out.println(test.getId());
        System.out.println(test.getName());
        t1.start();
        t2.start();
        t3.start();

    }
}
class Test{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}