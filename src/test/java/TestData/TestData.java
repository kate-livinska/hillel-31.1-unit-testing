package TestData;

import app.Book;

import java.util.List;

public class TestData {
    public static final Book BOOK1 = new Book("To Kill a Mockingbird", "Harper Lee");
    public static final Book BOOK2 = new Book("1984", "George Orwell");
    public static final Book BOOK3 = new Book("Pride and Prejudice", "Jane Austen");
    public static final Book BOOK4 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    public static final Book BOOK5 = new Book("Moby-Dick", "Herman Melville");

    public static List<Book> TEST_BOOKS = List.of(BOOK1, BOOK2, BOOK3, BOOK4);
}
