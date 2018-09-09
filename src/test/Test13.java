package test;

public class Test13{
    String s;
    static class Inner {
        void testMethod() {
            s = "Hello world.";
        }
    }
    public static void main(String[] argv) {
        Inner i = new Inner();
        i.testMethod();
        System.out.println(s);
    }
}