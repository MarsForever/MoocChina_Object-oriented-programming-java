package test;

class Base08{
    Base08(int i){
        System.out.println("base constructor");
    }
    Base08(){}
}
public class BaseSup extends Base08{
    public static void main(String argv[]){
        BaseSup s= new BaseSup();
        //One
    }
    BaseSup(){
        //Two
    	super(10);
    }
    public void derived(){
        //Three
    	
    }
}