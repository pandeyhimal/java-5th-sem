package U_Interface;

interface ITeacher {
    public void teach();
}

interface IStudent {
    public void learn();
}

class College implements ITeacher, IStudent {
    @Override
    public void teach() {
        System.out.println("Teacher is studying:");
    }
    @Override
    public void learn() {
        System.out.println("Students are learning:");
    }
}

public class b_interface_multiple_inheritance {
    public static void main(String[] args) {
        College sanothimi = new College();
        sanothimi.teach();
        sanothimi.learn();
    }
}
