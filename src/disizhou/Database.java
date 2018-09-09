package disizhou;

import java.util.ArrayList;

public class Database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	public void add(Item item) {
		listItem.add(item);
	}
	public void list() {
//		for(CD cd : listCD) {
//			cd.print();
//		}
//		for(DVD dvd : listDVD) {
//			dvd.print();
//		}
		for(Item item : listItem) {
			item.print();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Database db = new Database();
//		db.add(new CD("title", "artist", 3, 60, "comment"));
//		db.add(new CD("title2", "artist2", 3, 60, "comment2"));
		db.add(new DVD("title", "director", 60, "comment"));
//		db.add(new VideoGame("abc", 10,true, "comment",44));
		db.add(new MP3("tingmamadehua","Zhoujielun",5,"I like this singer"));
		db.list();
	}

}
