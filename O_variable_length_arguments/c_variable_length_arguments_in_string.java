package O_variable_length_arguments;

public class c_variable_length_arguments_in_string {
    public void displayname(String... strs){
        System.out.println("\nThe number of arguments passed: " + strs.length);
        System.out.println("The values are: ");
        for (String name : strs) {
            System.out.print(name + "\t");      //escape characters works in print..
        }
    }

    public static void main(String[] args) {
        c_variable_length_arguments_in_string obj = new c_variable_length_arguments_in_string();
        obj.displayname("Himal");
        obj.displayname("Himal", "Ram", "Hari");
        obj.displayname("HIMAL", "Pandey", "john", "joseph");
    }
}
