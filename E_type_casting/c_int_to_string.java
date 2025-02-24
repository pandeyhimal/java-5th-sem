package E_type_casting;

public class c_int_to_string {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("The numeric value = " + num);
        String numString = String.valueOf(num);
        System.out.println("The value of numstring = " + numString);
        System.out.println(numString.getClass().getSimpleName());
    }
}
