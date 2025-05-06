package W_Exception_Handling.A_Thread;

public class c_thread_runnable implements Runnable {
    public void run() {
        System.out.println("Run built in method:");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread("Himal");
        Thread t2 = new Thread("Jeewan");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}