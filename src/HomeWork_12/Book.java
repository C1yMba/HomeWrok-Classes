package HomeWork_12;
public class Book {
    private String bookName;
    private Author author;
    private int bookYear;
    public Book(String name, Author author, int bookYear){
        this.author = author;
        this.bookName = name;
        this.bookYear = bookYear;
    }

    public Author getBookAuthor(){
        return this.author;
    }

    public String getBookName(){

        return this.bookName;
    }

    public int getBookYear(){

        return this.bookYear;
    }

    public void setBookYear(int year){

        this.bookYear = year;
    }

    public void setBookName(String authorName){

        this.bookName = authorName;
    }

}
