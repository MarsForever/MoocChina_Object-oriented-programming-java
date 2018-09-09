package disanzhou_Test;

import java.util.HashMap;
import java.util.Scanner;    
 
public class Main  {
	
	public static void main(String[] args) {
		HashMap<String, Integer> area= new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int cnt=0;
		String str;
		
		while(true)
		{
			str = in.next();
			if(str.equals("###"))  break;
			//add city's name to HashMap
			else area.put(str,cnt++);
		}
		//add distance data to Two-dimensional array
		int[][] distance = new int[cnt][cnt];
		//put distance data to Two-dimensional array
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<cnt;j++) {
				distance[i][j] = in.nextInt();
			}
		}
		String cityA = in.next();
		String cityB = in.next();
		//[area.get(cityA)]  get cityA's array number
		//[area.get(cityB)]  get cityB's array number 
		System.out.println(distance[area.get(cityA)][area.get(cityB)]);
		
	}
}

