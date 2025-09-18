import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void constructorTest() {
        Book b = null;
        assertNull(b);

        b = new Book();
        assertNotNull(b);
    }

    @Test
    void fieldSettingAndGetterTest() {
        String author = "J.K. Rowling";
        LocalDate due = LocalDate.of(2025, 5, 10);
        String isbn = "978-0747532743";
        int pages = 223;
        String subject = "Fantasy";
        String title = "Harry Potter and the Philosopher's Stone";

        Book b = new Book();
        b.setAuthor(author);
        b.setDueDate(due);
        b.setIsbn(isbn);
        b.setPageCount(pages);
        b.setSubject(subject);
        b.setTitle(title);

        assertEquals(author, b.getAuthor());
        assertEquals(due, b.getDueDate());
        assertEquals(isbn, b.getIsbn());
        assertEquals(pages, b.getPageCount());
        assertEquals(subject, b.getSubject());
        assertEquals(title, b.getTitle());
    }

    @Test
    void equalityTest() {
        Book b1 = new Book();
        b1.setAuthor("George Orwell");
        b1.setDueDate(LocalDate.of(2025, 6, 15));
        b1.setIsbn("978-0451524935");
        b1.setPageCount(328);
        b1.setSubject("Dystopian");
        b1.setTitle("1984");

        Book b2 = new Book();
        b2.setAuthor("F. Scott Fitzgerald");
        b2.setDueDate(LocalDate.of(2025, 7, 20));
        b2.setIsbn("978-0743273565");
        b2.setPageCount(180);
        b2.setSubject("Classic");
        b2.setTitle("The Great Gatsby");

        assertNotEquals(b1, b2);

        Book b3 = new Book();
        b3.setAuthor("George Orwell");
        b3.setDueDate(LocalDate.of(2025, 6, 15));
        b3.setIsbn("978-0451524935");
        b3.setPageCount(328);
        b3.setSubject("Dystopian");
        b3.setTitle("1984");

        assertEquals(b1, b3);

        Book b4 = b1;
        assertEquals(b1, b4);
    }

    @Test
    void setterTest() {
        Book b = new Book();
        b.setAuthor("J.R.R. Tolkien");
        b.setDueDate(LocalDate.of(2025, 8, 1));
        b.setIsbn("978-0618640157");
        b.setPageCount(423);
        b.setSubject("Fantasy");
        b.setTitle("The Fellowship of the Ring");

        String newAuthor = "Harper Lee";
        LocalDate newDue = LocalDate.of(2026, 1, 1);
        String newIsbn = "978-0061120084";
        int newPages = 281;
        String newSubject = "Classic";
        String newTitle = "To Kill a Mockingbird";

        b.setAuthor(newAuthor);
        b.setDueDate(newDue);
        b.setIsbn(newIsbn);
        b.setPageCount(newPages);
        b.setSubject(newSubject);
        b.setTitle(newTitle);

        assertEquals(newAuthor, b.getAuthor());
        assertEquals(newDue, b.getDueDate());
        assertEquals(newIsbn, b.getIsbn());
        assertEquals(newPages, b.getPageCount());
        assertEquals(newSubject, b.getSubject());
        assertEquals(newTitle, b.getTitle());
    }
}
