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

}
