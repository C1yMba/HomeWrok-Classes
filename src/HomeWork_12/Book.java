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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book oneBook = (Book) other;
        if (author.equals(oneBook.author) && bookName.equals(oneBook.bookName) && bookYear == oneBook.bookYear) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
       return java.util.Objects.hash(author,bookName,bookYear);
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
