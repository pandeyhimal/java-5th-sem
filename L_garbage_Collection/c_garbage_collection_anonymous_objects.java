package L_garbage_Collection;

public class c_garbage_collection_anonymous_objects {
    public static void main(String[] args) {
        // creating anonymous object

        new c_garbage_collection_anonymous_objects();
        new c_garbage_collection_anonymous_objects();

        //suggest for garbage collection
        System.gc();
    }
    public void fianlize()
    {
        System.out.println("Garbage collection for memory management........");
    }
}
