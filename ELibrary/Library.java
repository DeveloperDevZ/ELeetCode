public class Library{
  //Constructor 
  public class Library(User user, BookList bookList, Book current, Book[] activeList){
	this.user = user;
	this.bookList = bookList;
	this.current = current;
	this.activeList = activeList;
  }

  public class Library(User user, BookList bookList){
	this.user = user;
	this.bookList = bookList;
	this.current = null;
	this.activeList = null;
  }

  public class Library(User user{
	this.user = user;
	this.bookList = null;
	this.current = null;
	this.activeList = null;
  }

  //Fields 
  User user;
  BookList bookList;
  Book currentlyReading;
  Book[] activeList;

  //Methods
  public void addBook(Book book){
    bookList.addBook(book);
  }

  public void removeBook(Book book){
    bookList.removeBook(book);
  }
}