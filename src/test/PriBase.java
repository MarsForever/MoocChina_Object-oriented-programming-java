package test;

private class Base09{
    Base09(){
        int i = 100;
        System.out.println(i);
    }
}
public class PriBase extends Base09{
    static int i = 200;
    public static void main(String argv[]){
        PriBase p = new PriBase();
        System.out.println(i);
    }
}