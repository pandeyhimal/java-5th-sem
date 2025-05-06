package W_Exception_Handling.A_Thread;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class f_thread_get_set_priority {
    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        // Thread t1 = new Thread(obj, "Himal");

        // System.out.println("Thread priority = " + t1.getPriority());
        // System.out.println("Thread name = " + t1.getName());

        // t1.start();

        Thread t1 = new Thread(obj, "Ram");
        Thread t2 = new Thread(obj, "Sita");
        Thread t3 = new Thread(obj, "Hari");
        Thread t4 = new Thread(obj, "HIMAL");
        Thread t5 = new Thread(obj, "Pandey");

        Thread t6 = new Thread(obj, "X");
        Thread t7 = new Thread(obj, "Y");
        Thread t8 = new Thread(obj, "H");
        Thread t9 = new Thread(obj, "Z");
        Thread t10 = new Thread(obj, "W");



        // t1.setPriority(3);
        // t2.setPriority(2);
        // t3.setPriority(4);
        // t4.setPriority(Thread.MAX_PRIORITY);
        // t5.setPriority(Thread.MIN_PRIORITY);

        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        
    }
}
