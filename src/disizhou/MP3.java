package disizhou;

public class MP3 extends Item{
	private String singer;
	public MP3(String title, String singer, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.singer = singer;
	}
	
	public void print() {
		System.out.print("MP3:");
		super.print();
		System.out.print(singer);
	}
}
