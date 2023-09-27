package HomeWork_12;
public class Zapusk {
    public static void main(String[] args) {

        Author authorOne = new Author("Ivan","Ivanov");
        Author authorTwo = new Author("Kiril","Volnii");


        Book bookOne = new Book("Unesennie",authorOne,1963);
        Book bookTwo = new Book("Prinesennie",authorTwo,1978);
        System.out.println("bookTwo.Year = " + bookTwo.getBookYear());
        bookTwo.setBookYear(1878);
        System.out.println("bookTwo.Year = " + bookTwo.getBookYear());
        Author authorOfBookOne = bookOne.getBookAuthor();
        System.out.println(authorOfBookOne.getAuthorName() + " " + authorOfBookOne.getAuthorSurname());
    }
}
