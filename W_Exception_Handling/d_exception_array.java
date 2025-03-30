package W_Exception_Handling;

public class d_exception_array {
    public static void main(String[] args) {
        int[] nums = { 43, 3, 65, 3, 85, 324, 83, 3 };
        try {
            for (int i = 0; i <= nums.length; i++) {
                System.out.println(nums[i]);
            } 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception handled:" +e);
        }
    }
}
