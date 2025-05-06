package W_Exception_Handling.A_Thread;

class Threadlife extends Thread {
    private String threadname;

    Threadlife(String name) {
        threadname = name;
        System.out.println("Thread " + threadname + " is in NEW state:");
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadname + " is in the RUNNING state:");
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Thread " + threadname + " is performing tasks:");
                System.out.println("Thread " + threadname + " is in WAITING state:");
                Thread.sleep(1000); // Simulates waiting state
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadname + " was interrupted:");
        }
        System.out.println("Thread " + threadname + " is in TERMINATED state:");
    }

    @Override
    public void start() {
        System.out.println("Thread " + threadname + " is in RUNNABLE state:");
        super.start();
    }
}

public class h_thread_life_cycle {
    public static void main(String[] args) {
        Threadlife t1 = new Threadlife("Thread-1");
        Threadlife t2 = new Threadlife("Thread-1");

        t1.start();
        t2.start();
    }
}
