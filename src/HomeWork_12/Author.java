package HomeWork_12;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String name, String surname){
        this.authorName = name;
        this.authorSurname = surname;
    }

    public String getAuthorName(){

        return this.authorName;
    }
    public String getAuthorSurname(){

        return this.authorSurname;
    }

    public void setAuthorName(String authorName){

        this.authorName = authorName;
    }

    public void setAuthorSurname(String authorSurname){

        this.authorSurname = authorSurname;
    }

    public String toString(){
        return "\nФио автора: " +  this.authorName + " " + this.authorSurname;
    }

    public Boolean equals(Author author){
        if(author == null){
            return false;
        }else {
            return this == author;
        }
        // .author.equals(book.getBookAuthor()) && this.bookName.equals(book.getBookName()) && this.bookYear == book.getBookYear() - есть еще такой момент
        // в этом случае работает и через == но так как сравниваем две строки только чере equals то equals в equals
        // правда касаемо == хотелось бы получить объяснение почему работает
    }

    public int hashCode(){
        int result = authorName.hashCode() + authorSurname.hashCode();
        return result;
    }

}
