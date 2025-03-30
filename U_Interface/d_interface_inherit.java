package U_Interface;

interface Sanothimi {
    public void Student();
}

interface College extends Sanothimi {
    public void employee();
}

class campus implements College {
    @Override
    public void employee() {
        System.out.println("Employee method:");
    }

    @Override
    public void Student() {
        System.out.println("Student method:");
    }
}

public class d_interface_inherit {
    public static void main(String[] args) {
        campus obj = new campus();
        obj.employee();
        obj.Student();
    }
}
