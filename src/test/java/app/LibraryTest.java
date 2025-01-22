package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static TestData.TestData.*;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    static Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.setBooks(TEST_BOOKS);
    }

    @Test
    void getBooks_ok() {
        List<Book> expected = List.of(BOOK1, BOOK2, BOOK3, BOOK4);
        List<Book> actual = library.getBooks();

        assertEquals(expected, actual);
    }

    @Test
    void getBookCount_booksPresent() {
        int expected = 4;
        int actual = library.getBookCount();

        assertEquals(expected, actual);
    }

    @Test
    void addBook_validBookIsAdded() {
        library.addBook(BOOK5);

        assertTrue(library.getBooks().contains(BOOK5));
    }

    @Test
    void addBook_bookIsNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    void removeBook_bookIsPresent() {
        library.removeBook(BOOK1);
        assertFalse(library.getBooks().contains(BOOK1));
    }

    @Test
    void removeBook_bookIsAbsent() {
        assertFalse(library.removeBook(BOOK5));
    }

    @Test
    void removeBook_bookIsNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }
}