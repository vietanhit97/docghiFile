import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadBook {
	public ArrayList<Book> docFile(){
		ArrayList<Book> listSach = null;
		try {
			File file = new File("E:/danhSachBook.txt");
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			listSach = (ArrayList<Book>) oi.readObject();
			System.out.println(listSach);
			fi.close();
			oi.close();
		}catch(Exception o) {
			o.printStackTrace();
		}
		return listSach;
	}
}
