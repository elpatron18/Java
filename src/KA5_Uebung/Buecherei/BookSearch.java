package KA5_Uebung.Buecherei;

import java.util.List;

public interface BookSearch {

    List<Book> searchByAuthor(String authorName) throws BookNotFoundException;
    List<Book> searchByTitle(String title) throws BookNotFoundException;

}
