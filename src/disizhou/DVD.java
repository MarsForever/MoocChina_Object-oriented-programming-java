package disizhou;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);
//		this.title = title;
		setTitle("b");
		this.director = director;
//		this.playingTime = playingtime;
//		this.commnet = commnet;
	}

	public static void main(String[] args) {
		DVD dvd = new DVD("a","b",1,"..");
		dvd.print();
	}

	public void print() {
		System.out.println("DVD:");
		super.print();
		System.out.println(director);		
	}

}
