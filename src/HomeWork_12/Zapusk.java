package HomeWork_12;
public class Zapusk {
    public static void main(String[] args) {

        Author authorOne = new Author("Kiril","Volnii");
        Author authorTwo = new Author("Kiril","Volnii");


        Book bookOne = new Book("Unesennie",authorTwo,1963);
        Book bookTwo = new Book("Unesennie",authorTwo,1963);
        System.out.println("bookTwo.Year = " + bookTwo.getBookYear());
        System.out.println("bookTwo.Year = " + bookTwo.getBookYear());
        Author authorOfBookOne = bookOne.getBookAuthor();
        System.out.println(authorOfBookOne.getAuthorName() + " " + authorOfBookOne.getAuthorSurname());
        System.out.println(bookTwo.equals(bookOne));
        System.out.println(authorOne.equals(authorTwo));
        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
        System.out.println(authorOne.hashCode());
        System.out.println(authorTwo.hashCode());
    }
}
