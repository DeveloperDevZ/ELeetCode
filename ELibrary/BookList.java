public class BookList{
  //Constructor 
	public BookList(BookNode headBookNode){
		this.headBookNode = headBookNode;
	}

	public BookList(){
		this.headBookNode = null;
	}

  //Fields 
  BookNode headBookNode;

  //Methods 
  //addBook 
  public void addBook(Book book){
    BookNode newBookNode = new BookNode(book);
    
    if(headBookNode == null){
      headBookNode = newBookNode;
    }else{
      BookNode current = headBookNode; 
      while(current.next != null){
        current = current.next;
      }
      current.next = newBookNode;
    }
  }

  public void removeBook(Book book){
    if(headBookNode == null){
      return;
    }
    
    if(headBookNode.book.equals(book)){
      headBookNode = headBookNode.next;
      return;
    }

    BookNode current = headBookNode;
    BookNode previous = null;

    while(current != null && current.book != book){
      previous = current;
      current = current.next;
    }

    if(current == null){
      return;
    }

    previous.next = current.next;



  }

}