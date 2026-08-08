package tasktwo;
class book{
	int bookid;
	String bookname;
	String author;
	int price;
	void display() {
		System.out.println("Bookid is:"+ bookid);
		System.out.println("Book name is:"+ bookname);
		System.out.println("Author is:"+ author);
		System.out.println("price is:"+ price);
	}
}

public class PartA {
 public static void main(String[] args) {
	 book b=new book();
	 b.bookid=238;
	 b.bookname="core java";
	 b.author="james gosling";
	 b.price=250;
	 
System.out.println("The above details are about the core java book");
 b.display();
 }
}