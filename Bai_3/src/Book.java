import java.io.Serializable;

public class Book implements Serializable{
	private String isbn;
	private String bookName;
	private String author ;
	private String publisher;
	private float price ;
	

public Book(String isbn2, String bookName2, String author2, String publisher2, Float price2) {
		this.isbn = isbn2;
		this.bookName = bookName2;
		this.author = author2;
		this.publisher = publisher2;
		this.price = price2;
	}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
	
	
}
