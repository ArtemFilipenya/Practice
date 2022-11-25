package equals;

public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    /*
    This method should compare by one unique value!
     */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Book) {
            return this.name.equals(((Book) object).name);
        }
        return false;
    }

    /*
    This method should take the same variables as the equals
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}