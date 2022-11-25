package equals;

/**
 * This class is needed for the equals test.
 *  Method equals should be:
 *  -reflexive
 *  -symmetric
 *  -transitive
 *  -consistent
 *  -not null
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1");
        Book book2 = new Book("book2");
        Book book3 = new Book("book3");

        System.out.println("reflexive: " + book1.equals(book1)); // always true
        System.out.println("symmetric (if book1.equals(book2) == true => book2.equals(book1) == true): "
                + book1.equals(book2) + " | " + book2.equals(book1));
        System.out.println("transitive (if book1.equals(book2) == true && book2.equals(book1) == true => "
                + "book3.equals(book1) == true): " + book1.equals(book2) + " | " + book2.equals(book1)
                + " | " + book1.equals(book3));
        System.out.println("consistent(many times book1.equals(book2) == true): " + book1.equals(book2));
        System.out.println("not null: " + book1.equals(null)); //always false
    }
}