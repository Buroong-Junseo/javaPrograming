package week12;

public class Books {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Books() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Books(String title) {
		this(title, "작자미상");
	}
	
	public Books(String title, String author ) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book LittlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book();
		Book emptyBook = new Book();
		loveStory.show();
	}
}
