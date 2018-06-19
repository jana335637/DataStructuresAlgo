import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {

    static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        //threadmisc();s

        lock.lock();
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        multi m = new multi();
        //m.run(); It won't be treated as thread, runs on main call stack, No stack will be created
        //m.join(1000);
        multi m2 = new multi();
        multi m3 = new multi();
        m.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m.start();
        m2.start();
        m3.start();
        //System.out.println("id of t1:"+m3.getId());

        multirunnable m1 = new multirunnable();
        Thread t  =new Thread(m1);
        t.start();
    }

    private static void threadmisc() {
        Thread t =new Thread();
        t.start();

    }

}

class multi extends Thread{
    public void run() {
        System.out.println("Name of running thread:"+Thread.currentThread().getName() +" Priority:"+Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

}

class multirunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MultiRunnable is running.........");
    }

}