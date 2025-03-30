package L_garbage_Collection;

public class a_garbage_collection_null {
    public static void main(String[] args) {
        // a_garbage_collection obj1 = new a_garbage_collection();
        // a_garbage_collection obj2 = new a_garbage_collection();
        // obj1 = null;
        // obj2 = null;

        System.gc();
    }

    public void fianlize() {
        System.out.println("Garbage collection for memory management:");
    }
}
