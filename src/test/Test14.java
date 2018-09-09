package test;

interface I {
    void setValue(int val);
    int getValue();
}

//interface Test14 implements I {
//    void increment();    
//}

//abstract class Test14 implements I {
//    int value;
//    public void setValue(int val) { value = val; }
//    public int getValue() { return value; }
//}
// OK
//
//class Test14 extends I {
//    int value;
//    void setValue(int val) { value = val; }
//    int getValue() { return value; }
//}
//
//class Test14 extends I {
//    void increment();
//}