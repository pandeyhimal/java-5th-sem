//write a program in java to enter employee id, name of an employee and to display the information using interface.
package U_Interface;

interface employeeDetails {
    public void employeeinfo(int id, String name);
}

class detail implements employeeDetails {
    @Override
    public void employeeinfo(int id, String name) {
        int emp_id = id;
        String emp_name = name;
        System.out.println("ID = " + emp_id + "\n Employee Name = " + emp_name);
    }
}

public class e_class_task {
    public static void main(String[] args) {
        detail obj = new detail();
        obj.employeeinfo(7, "Himal");
    }
}
