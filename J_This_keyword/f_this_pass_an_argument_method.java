package J_This_keyword;

// public class f_this_pass_an_argument_method {
//     void hello(){
//         System.out.println("Hello Sanothimi");
//     }
//     void hi()
//     {
//         hello();
//     }
//     public static void main(String[] args) {
//         f_this_pass_an_argument_method obj1 = new f_this_pass_an_argument_method();
//         obj1.hi();
//     }
// }

public class f_this_pass_an_argument_method {
    void hello(f_this_pass_an_argument_method obj){
        System.out.println("Hello Sanothimi");
    }
    void hi()
    {
        hello(this);
    }
    public static void main(String[] args) {
        f_this_pass_an_argument_method obj1 = new f_this_pass_an_argument_method();
        obj1.hi();
    }
}
