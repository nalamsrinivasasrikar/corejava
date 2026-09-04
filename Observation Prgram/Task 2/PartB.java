package tasktwo;
	//constructor with parameters
	class call{
		   private int bookid;
		  private  String  bookname;
		   private String author;
		  private  double price;
		 public call( int id , String name , String author , double price){
		    this.bookid = id;
		    this.bookname = name;
		    this.author = author;
		    this.price = price;
		 }
		void setbookid(int id ){
		    bookid = id;
		}
		void setbookname(String name){
		    bookname = name;
		}
		void setauthor(String author ){
		   this.author = author;
		}
		void setprice(double price){
		    this.price = price;
		}
		int getbookid(){
		    return bookid;
		}
		String getbookname(){
		    return bookname;
		}
		String getauthor(){
		    return author;
		}
		double getprice(){
		    return price;
		}
		}
		public class PartB {
		public static void main(String[] args) {
		    call c = new call(238, "java", "Gosling", 350.50);
		    System.out.println("book id is:"+ c.getauthor());
		    System.out.println("book name is:"+c.getbookname());
		    System.out.println("author is: "+ c.getauthor());
		    System.out.println("price is: "+c.getprice());

		}
		    
		}




