import java.util.List;

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


}
