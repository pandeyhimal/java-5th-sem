package O_variable_length_arguments;

public class d_variable_length_argument_in_static {
    public static void displayname(String... strs){
        System.out.println("\nThe number of arguments passed: " + strs.length);
        System.out.println("The values are: ");
        for (String name : strs) {
            System.out.print(name + "\t");      //escape characters works in print..
        }
    }

    public static void main(String[] args) {
        displayname();
        displayname("Himal");
        displayname("Himal", "Ram", "Hari");
        displayname("HIMAL", "Pandey", "john", "joseph");
    }
}
