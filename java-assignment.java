

class Book
{
	protected String book_author = null;
	protected String book_title = null;

	Book(String book_author,String book_title)
	{
		this.book_author = book_author;
		this.book_title = book_title;
	}
	// void setAuthor(String book_author)
	// {
	// 	this.book_author = book_author;
	// }

	void getAuthor()
	{
		System.out.println("author of book "+this.book_title +" is " +this.book_author);
	}

	// void setTitle(String book_title)
	// {
	// 	this.book_title = book_title;
	// }
	void getTitle()
	{
		System.out.println("Title of book is :"+this.book_title);
	}

}

class BookDetails extends Book
{
	protected double price;
	protected int current_stock;

	BookDetails(double price , int current_stock)
	{
		super();
		this.price = price;
		this.current_stock = current_stock;
	}

	BookDetails(String book_author,String book_title,double price,int current_stock)
	{
		super(book_author,book_title);
		this.book_title = book_title;
		this.book_author = book_author;
	}

	void setPrice(double price)
	{
		this.price = price;
	}
	
	void getPrice()
	{
		System.out.println("price of book is : "+ this.price);
	}
	
	void getCurrentstock()
	{
		System.out.println("available stock is " +this.current_stock);
	}
}