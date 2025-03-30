package I_variables_constants;

class College {
    final int clzID = 7921012;

    void display() {
        System.out.println("College ID = " + clzID);
    }
}
public class b_variable_final {
public static void main(String[] args) {
    College c1 = new College();
    c1.display();
}
    
}