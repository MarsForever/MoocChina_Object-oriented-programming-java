package diyizhou;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();
	}
}

class Fraction {

    int a;
    int b;
    Fraction(int a ,int b) {
        int gcd = GCD(a,b);
        this.a = a/gcd;
        this.b = b/gcd;
    }
     //分数转小数，在这题中有用到
     double toDouble(int a ,int b) {
         double ret = a*1.0/b ;
         return ret;
     }
      
     //分数“x”，返回一个新的Fraction
    Fraction  multiply(Fraction r){
        int a1 = a*r.a ;
        int b1 = b*r.b ;
        int gcd = GCD(a1,b1);
        a1 /= gcd ;
        b1 /= gcd ;
     Fraction x = new Fraction(a1,b1);
     return x ;
     }
    //分数“＋” ，返回一个新的Fraction 
    Fraction plus(Fraction r) {
        int b1 = LCM(b,r.b);
        int a1 = a*(b1/b) + r.a*(b1/r.b);
        int gcd = GCD(a1,b1);
        b1 /= gcd ;
        a1 /= gcd ;
        Fraction x = new Fraction(a1,b1);
        return x ;
         
    }
    //print Method !!
    void print() {
        if(a==0) {
            System.out.println(0);
        }
        else if(a==b) {
            System.out.println(1);
        }
        else System.out.println(a+"/"+b);
    }
    //Method最大公约数
    int GCD(int a,int b) { return b==0 ? a : GCD(b, a%b); }
    //Method最小公倍数
    int LCM(int x,int y) {
        int gcd = GCD(x,y);
        return x*y/gcd;
    }
     
}