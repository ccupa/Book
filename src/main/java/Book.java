import java.time.LocalDate;
import java.util.Objects;

public class Book {
    public static int AUTHOR_;
    public static int DUE_DATE;
    public static int ISBN_;
    public static int PAGE_COUNT_;
    public static int SUBJECT_;
    public static int TITLE;
    private String author;
    private LocalDate dueDate;
    private String isbn;
    private int pageCount;
    private String subject;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return AUTHOR_ == book.AUTHOR_ && DUE_DATE == book.DUE_DATE && ISBN_ == book.ISBN_ && PAGE_COUNT_ == book.PAGE_COUNT_ && SUBJECT_ == book.SUBJECT_ && TITLE == book.TITLE && pageCount == book.pageCount && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(subject, book.subject) && Objects.equals(title, book.title);
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AUTHOR_, DUE_DATE, ISBN_, PAGE_COUNT_, SUBJECT_, TITLE, author, isbn, pageCount, subject, title);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title + " by " + author + " ISBN: " + isbn;
    }
}
