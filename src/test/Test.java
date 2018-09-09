package test;

class Base {
    private Base() { System.out.println(0);}
    public Base(int i) {System.out.println(i);}
}
public class Test extends Base {
    public Test() {super(1);};
    public static void main(String argv[]){
        Test t = new Test();
    }
}