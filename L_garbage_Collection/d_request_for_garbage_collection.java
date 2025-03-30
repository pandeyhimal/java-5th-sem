package L_garbage_Collection;

public class d_request_for_garbage_collection {
    public static void main(String args[]) {
        /*
         * Here we are intentionally assigning a null
         * value to a reference so that the object becomes
         * non reachable
         */
        d_request_for_garbage_collection obj = new d_request_for_garbage_collection();
        //obj = null;

        /*
         * Here we are intentionally assigning reference a
         * to the another reference b to make the object referenced
         * by b unusable.
         */
        d_request_for_garbage_collection a = new d_request_for_garbage_collection();
        d_request_for_garbage_collection b = new d_request_for_garbage_collection();
        // b = a;
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM");
    }
}
