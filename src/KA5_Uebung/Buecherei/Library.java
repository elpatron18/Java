package KA5_Uebung.Buecherei;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookSearch{

    public List<Book> searchByAuthor(String authorName) throws BookNotFoundException{

        List<Book> drin = new ArrayList<>();
        for (Book b : this.books)
            if (b.getAuthor().getName().equals(authorName))
                drin.add(b);

        if (drin.size() != 0) return drin;

        throw new BookNotFoundException("Buch wurde nicht gefunden");
    }

    public List<Book> searchByTitle(String title) throws BookNotFoundException{

        List<Book> drin = new ArrayList<>();
        for (Book b : this.books) if (b.getTitle().equals(title)) drin.add(b);

        if (drin.size() != 0) return drin;

        throw new BookNotFoundException("Buch wurde nicht gefunden");
    }

    public List<Author> getAllAuthors() throws AuthorNotFoundException{

        List<Author> liste = new ArrayList<>();
        for (Author a : this.authors) {

            boolean drin = false;
            /*for (Author b : liste) if (b == a) drin = true;

            if (!drin) liste.add(a); */

            if (!liste.contains(a)) liste.add(a);
        }
        if (liste.size() != 0) return liste;

        throw new AuthorNotFoundException("Author wurde nicht gefunden");
    }

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

}
