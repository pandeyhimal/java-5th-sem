package W_Exception_Handling.A_Thread;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running:");
    }
}

public class d_thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
