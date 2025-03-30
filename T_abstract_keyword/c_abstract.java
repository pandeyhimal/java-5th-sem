package T_abstract_keyword;

abstract class Sanothimi {
    abstract void hi();

    public void hello() {
        System.out.println("Hello Sanothimi:");
    }
}

class Student extends Sanothimi {
    @Override
    public void hi() {
        System.out.println("Hi Sanothimi:");
    }
}

public class c_abstract {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.hi();
        s1.hello();
    }
}
