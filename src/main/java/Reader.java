import java.util.List;
import java.util.Objects;

public class Reader {
    public static int CARD_NUMBER_;
    public static int NAME_;
    public static int PHONE_;
    public static int BOOK_COUNT_;
    public static int BOOK_START_;
    private int cardNumber;
    private String name;
    private String phone;
    private List<Book> books;


    public enum Code {
        SUCCESS,
        BOOK_ALREADY_CHECKED_OUT_ERROR,
        READER_DOESNT_HAVE_BOOK_ERROR,
        READER_COULD_NOT_REMOVE_BOOK_ERROR
    }

    public Reader(int cardNumber, String name, String phone) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.phone = phone;
    }

    public Code addBook(Book book) {
        if(books.contains(book)) {
            return Code.BOOK_ALREADY_CHECKED_OUT_ERROR;
        }
        books.add(book);
        return Code.SUCCESS;
    }

    public Code removeBook(Book book) {
        if (!books.contains(book)) {
            return Code.READER_DOESNT_HAVE_BOOK_ERROR;
        }
        boolean removed = books.remove(book);
        if (removed) {
            return Code.SUCCESS;
        }
        return Code.READER_COULD_NOT_REMOVE_BOOK_ERROR;
    }

    public boolean hasBook(Book book) {
        return books.contains(book);
    }

    public static int getBookCount() {
        return BOOK_COUNT_;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return cardNumber == reader.cardNumber && Objects.equals(name, reader.name) && Objects.equals(phone, reader.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, name, phone);
    }

    public String toString() {
        return name + "(#" + cardNumber + ") has checked out " + "{" + books + "}";
    }
}
