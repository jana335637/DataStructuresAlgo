import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++)
        {
            Runnable worker = new workerThread(""+i);
            executor.execute(worker);
        }
    }
}

class workerThread implements Runnable{
    private String message;

    public workerThread(String message)
    {
        this.message=message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
}
