package L_garbage_Collection;

public class b_garbage_collection_same_obj_reference {

    public static void main(String[] args) {
        b_garbage_collection_same_obj_reference obj1 = new b_garbage_collection_same_obj_reference();
        b_garbage_collection_same_obj_reference obj2 = new b_garbage_collection_same_obj_reference();

        obj2 = obj1;

        System.gc();
    }
    public void fianlize()
    {
        System.out.println("Garbage collected for memory management......");
    }
}