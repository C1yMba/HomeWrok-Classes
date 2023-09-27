package HomeWork_12;
public class Book {
    private String bookName;
    private Author author;
    private int bookYear;

    public Book(String name, Author author, int bookYear) {
        this.author = author;
        this.bookName = name;
        this.bookYear = bookYear;
    }

    public String toString() {
        return "Название книги: " + this.bookName + author.toString() + "\nГод издания: " + this.bookYear;
    }

    public Boolean equals(Book book) {
        if (book == null) {
            return false;
        } else {
            return this == book;
            // this.author.equals(book.getBookAuthor()) && this.bookName.equals(book.getBookName()) && this.bookYear == book.getBookYear() - и можно так
        }
    }
    public int hashCode(){
     int result = author.hashCode() + bookName.hashCode() + bookYear;
     return result;
    }


    public Author getBookAuthor() {
        return this.author;
    }

    public String getBookName() {

        return this.bookName;
    }

    public int getBookYear() {

        return this.bookYear;
    }

    public void setBookYear(int year) {

        this.bookYear = year;
    }

    public void setBookName(String authorName) {

        this.bookName = authorName;
    }
}
