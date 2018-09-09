package dibazhou;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		byte[] buf = new byte[10];
		for(int i = 0 ; i < buf.length; i++) {
			buf[i]= (byte) i;
		}
		try {
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("a.txt"))
					);
			int i = 1234567;
			out.writeInt(i);
			out.close();
			
			DataInputStream in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("a.txt"))
					);
			int j = in.readInt();
			System.out.println(j);
//			FileOutputStream out = new FileOutputStream("a.txt");
//			out.write(buf);
//			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
