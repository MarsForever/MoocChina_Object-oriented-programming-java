package test;

class Base11 {

private Base11() { System.out.println(0);}

public Base11(int i) {System.out.println(i);}
}

public class Test11 extends Base {
	public Test11() {
		super(1);
	};

	public static void main(String argv[]) {
		Test t = new Test();
	}
}