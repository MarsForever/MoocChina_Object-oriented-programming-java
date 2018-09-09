package test;

class Base15{
    public Base15(int i){}
}
public class MyOver extends Base15{
    public static void main(String arg[]){
        MyOver m = new MyOver(10);
    }
    MyOver(int i){
        super(i);
    }
    MyOver(String s, int i){
        this(i);
        //Here
//        A.
        Base b = new Base(10);


//        B.
//        MyOver m = new MyOver();


//        C.
//        this("Hello",10);


//        D.
//        super(); 
    }
}