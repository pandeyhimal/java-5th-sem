package W_Exception_Handling.A_Thread;

class hello implements Runnable {
    public void run() {
        System.out.println("Thread is running:");
    }
}

public class e_thread_runnable {
    public static void main(String[] args) {
        hello obj = new hello();
        Thread obj1 = new Thread(obj);

        obj1.start();
    }
}
