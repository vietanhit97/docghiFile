import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteBook {
	int soLuong = 0;
	private ArrayList<Book> book;

	public WriteBook() {
		this.book = new ArrayList<Book>();
	}

	public WriteBook(ArrayList<Book> book) {
		this.book = book;
	}

	public void nhapDsBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so cuon sach can them thong tin :");
		soLuong = sc.nextInt();
		for (int i = 0; i < soLuong; i++) {
			sc.nextLine();
			System.out.println("Nhap isbn : ");
			String isbn = sc.nextLine();
			System.out.println("Nhap ten sach :");
			String bookName = sc.nextLine();
			System.out.println("nhap ten tac gia :");
			String author = sc.nextLine();
			System.out.println("nhap nha xuat ban :");
			String publisher = sc.nextLine();
			System.out.println("nhap gia sach :");
			Float price = sc.nextFloat();
			Book sach = new Book(isbn, bookName, author, publisher, price);
			this.book.add(sach);
		}
	}

	public void ghiBook() {
		try {
			File file = new File("E:/danhSachBook.txt");
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(this.book);
			f.close();
			o.close();
		} catch (Exception o) {
			o.printStackTrace();
		}
	}
}
