package KA5_Uebung.Buecherei;

import java.util.*;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                ", books=" + books +
                '}';
    }
}
