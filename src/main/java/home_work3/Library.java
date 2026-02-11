package home_work3;

public class Library {
private String bookTitle;
private String author;
private int year;
private String category;
public Library(String someBookTitle, String someAuthor, int someYear, String someCategory){
    bookTitle = someBookTitle;
    author = someAuthor;
    year = someYear;
    category =someCategory;
}
public String getBookTitle(){
    return bookTitle;}

//public void setBookTitle(String newBookTitle){
//    bookTitle = newBookTitle;
//}

public String getAuthor(){
    return author;}
//public void setBookTitle(String newAuthor){
//    author = newAuthor;
//   }

}
