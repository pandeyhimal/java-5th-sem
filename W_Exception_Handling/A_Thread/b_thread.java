package W_Exception_Handling.A_Thread;

class ONe extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HELLO!");
        }
    }
}

class TWo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HI!");
        }
    }
}

public class b_thread {
    public static void main(String[] args) {
        ONe one = new ONe();
        TWo two = new TWo();

        one.start();
        two.start();
    }
}
