public class Book{
  //Constructor
  public Book(String title, String[] pages){
	this.title = title;
	this.pages = pages;
	this.activity = false;
	this.currentPage = 0;
  }

  //Fields 
  String title;
  String[] pages;
  boolean activity;
  int currentPage; 

  //Methods
  public String[] displayPage(){
	return this.currentPage;
  }
  
  public String[] turnPage(){
	this.currentPage += 1;
	return this.pages[currentPage];
  }

  public void toggleActivity(){
         this.activity = !(this.activity);
  }


}