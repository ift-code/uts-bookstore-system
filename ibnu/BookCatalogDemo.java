package ibnu;

import shared.Book;

public class BookCatalogDemo {
    public static void main(String[]args) {

        BookCatalog catalog = newBookCatalog(2);

        catalog.addBook(newBook("978-1", "Laskar Pelangi", "Andrea Hirata", 85000, 10));
        catalog.addBook(newBook("978-2", "Bumi Manusia", "Pramoedya A.T.", 95000, 5));
        catalog.addBook(newBook("978-3", "Negeri 5 Menara", "Ahmad Fuadi", 79000, 8));

        System.out.println("Total: " + catalog.size());
        Book found = catalog.findByIsbn("978-2");
        if (found != null) {
            System.out.println("Found:" + found);
        }
        catalog.findByTitle("Laskar Pelangi");
        if(catalog.removeBook("978-1")) {
            System.out.println("Book 978-1 removed.");
        }
        catalog.listAll();
    }
}