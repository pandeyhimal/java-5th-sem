package W_Exception_Handling.A_Thread;

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + ", " + "State: New");
    }

    public void run() {
        System.out.println("Thread: " + threadName + ", " + "State: Running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
        }
        System.out.println("Thread: " + threadName + ", " + "State: Dead");
    }

    public void start() {
        System.out.println("Thread: " + threadName + ", " + "State: Start");
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class g_states_of_thread {
    public static void main(String args[]) {
        ThreadDemo thread1 = new ThreadDemo("Thread-1");
        ThreadDemo thread2 = new ThreadDemo("Thread-2");
        thread1.start();
        thread2.start();
    }

}
