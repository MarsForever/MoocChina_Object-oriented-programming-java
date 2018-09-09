package test;

class Base12 {
    void f(int i) {System.out.println("int"); }
    void f(double d) {System.out.println("double");}
}
public class Test12 extends Base12 {
    void f(String s) { System.out.println("String"); }
    public static void main(String argv[]){
        Test12 a = new Test12();
        a.f(10);
    }
}