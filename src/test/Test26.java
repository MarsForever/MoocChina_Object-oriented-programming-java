package test;

public class Test26 {
    public int t=4;
    public static void main(String[] args) {
        new Test26().NumberPlay();
    }
    public void NumberPlay() {
        int t=2;
        t = t+5;
        this.t = this.t-2;
        t = t-this.t;
        System.out.println(t+this.t+"ok");
    }
}
