package book;

public class Book {
	private String title;
	private String author;
	private int price;
	private static int edition;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return "title " + title + ", author " + author + ", price " + price;
	}

	public boolean equals(Book b) {
		if (b == null)
			return false;
		return (((this.title).equals(b.title)) && ((this.author).equals(b.author)) 
				&& ((this.price) == (b.price)));
				//&& ((this.edition) == (b.edition)));
	}

	public int hashCode() {
		return 88 * this.title.hashCode() + 88 * this.author.hashCode() + 88 * this.price;
	}

	protected Object clone() throws CloneNotSupportedException {
		return new Book(this.title, this.author, this.price);
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}
	
}
