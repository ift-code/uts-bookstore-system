package ibnu;

import shared.Book;

public class BookCatalogDemo {
    public static void main(String[] args) {

        BookCatalog catalog = new BookCatalog();

        catalog.addBook(new Book("978-1", "Laskar Pelangi", "Andrea Hirata", 85000, 10, 2005));
        catalog.addBook(new Book("978-2", "Bumi Manusia", "Pramoedya A.T.", 95000, 5, 1980));
        catalog.addBook(new Book("978-3", "Negeri 5 Menara", "Ahmad Fuadi", 79000, 8, 2009));

        System.out.println("Total: " + catalog.size());

        catalog.findByIsbn("978-2");
        catalog.findByTitle("Laskar");

        catalog.removeBook("978-1");

        catalog.listAll();
    }
}