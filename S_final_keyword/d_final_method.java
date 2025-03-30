package S_final_keyword;

class Teacher {
    // final void study(){
    void study() {
        System.out.println("Teacher is studying:");
    }
}

public class d_final_method extends Teacher {
    void study() {
        System.out.println("Studying is not studying:");
    }

    public static void main(String[] args) {
        d_final_method obj = new d_final_method();
        Teacher t1 = new d_final_method();
        Teacher t2 = new Teacher();
        t1.study();
        t2.study();
        obj.study();
    }
}
