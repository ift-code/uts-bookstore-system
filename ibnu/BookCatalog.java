package ibnu;

import shared.Book;

public class BookCatalog {
    private Book[] books;
    private int size;
    public BookCatalog() {
        books = new Book[10];
        size = 0;
    }
    public void addBook(Book book) {
        books[size++] = book;
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < size; i++) {
            if
            (books[i].getIsbn().equals(isbn)) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                size--;
                System.out.println("Book " + isbn + "removed succesfully");
                return;
            }
        }
    }
    public void findByIsbn(String isbn) {
        for (int i = 0; i < size; i++) {
            if
            (books[i].getIsbn().equals(isbn)) {

                System.out.println("Found: " + books[i]);
                return;
            }
        }
    }
    public void findByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if
            (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + books[i]);
            }
        }
    }
    public void listAll() {
        System.out.println("=== BookCatalog ===");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}