package E_type_casting;

public class a_int_to_double {
    public static void main(String[] args) {
        int num_int = 42;
        System.out.println("The integer value is " + num_int);
        double num_double = (double) num_int;
        System.out.println("The double value is " + num_double);
        System.out.println(((Object)num_int).getClass().getSimpleName());
        System.out.println(((Object)num_double).getClass().getSimpleName());
    }
}
