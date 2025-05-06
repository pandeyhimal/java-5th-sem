package W_Exception_Handling.A_Thread;

public class a_thread {
    public static void main(String[] args) {
        Thread t1 = new Thread("Himal");
        Thread t2 = new Thread("Pandey");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
