package D_control_statement.c_loop;

public class d_for_each_loop {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        for (int x : arr) {                     // x variable holds the current element during each iteration
            System.out.println(x);
        }
    }
}
