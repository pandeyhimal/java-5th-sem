package E_type_casting;

public class f_double_to_string {
    public static void main(String[] args) {
        double num_double = 3434.5432;
        System.out.println("The double value is " + num_double);
        String string_double = Double.toString(num_double);
        System.out.println("The string conversion of double value = " + string_double);
        System.out.println(string_double.getClass().getName());
    }
}
