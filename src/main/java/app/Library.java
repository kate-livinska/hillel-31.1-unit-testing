package app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        } else {
            throw new IllegalArgumentException("Book cannot be null");
        }
    }

    public boolean removeBook(Book book) {
        if (book != null) {
            return books.remove(book);
        } else {
            throw new IllegalArgumentException("Book cannot be null");
        }
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void setBooks(List<Book> books) {
        this.books = new ArrayList<>(books);
    }
}
