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

    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        if (authorName.equals(author.getAuthorName()) && authorSurname.equals(author.getAuthorSurname())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        return java.util.Objects.hash(authorName,authorSurname);
    }

}
