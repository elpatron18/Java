package KA5_Uebung.Buecherei;

public class Tester {

    public static void main(String[] args) {

        try {
            Author nesim = new Author("Nesi");
            Book gay = new Book("ist Gay", nesim, "1234", "Romanze", 1900);
            Book gay2 = new Book("ist nicht nicht Gay", nesim, "1234", "Romanze", 1900);

            Library timoLibrary = new Library();

            timoLibrary.addBook(gay);
            timoLibrary.addBook(gay2);

            System.out.println(timoLibrary.searchByTitle("ist nicht Gay"));
        }
        catch (Exception e) {
            System.out.println("Es gibt ein Problem: " + e.getMessage());
        }

    }

}
