
public class Book {
	private int id; //integers are immutable like strings
	private String title;
	private String author;
	private Price price;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	public String toString() {
		return title + " by " + author;
	}

	//TODO: Resolve escape reference issue
	public Price getPrice() {
		return new Price(price);
	}
	
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
