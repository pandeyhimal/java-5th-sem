package E_type_casting;

public class d_string_to_int {
    public static void main(String[] args) {
        String string_num = "45";
        System.out.println("The value of string num = " + string_num);
        int string_Int = Integer.parseInt(string_num);
        System.out.println("The integer value = " + string_Int);
        int checkNum = 24;
        System.out.println("The sum = " + (string_Int + checkNum));
    }
}
