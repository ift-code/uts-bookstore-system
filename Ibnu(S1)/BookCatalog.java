package ibnu;

import shared.Book;

public class BookCatalog {
    private Book[] books;
    private int size;

    public BookCatalog(int capacity) {
        books = new Book[capacity];
        size = 0

    public void addBook(Book book) {
        if (size == books.length) {
            resize();
                    }
                    books[size++]
= book;         
  }
            }
            private void resize () {
                book[] newBooks = new
                Book[books.length * 2];
                for (int i = 0; i < size; i++) {
                    newBooks[i]
= books[i];
                }
                books = newBooks;
                            }
                public Book findByIsbn(String isbn) {
                    for (int i =0; i < size; i++) {
                        (books[i].getIsbn().equals(isbn)) {
                            return books[i];
                        }
                    }
                    return null;
                }
                public void findByTitle(String title) {
                    for (int i = 0; i < size; i++) {
                        (books[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                            system.out.println("Found:" + books[i]);
                        }
                    }
                }
                public boolean removeBook(String isbn) {
                    for (int i = 0; i < size; i++) {
                        if
                        (books[i].getisbn().equals(isbn)) {
                            for (int j = i; j < size - 1; j++) {
                                books[j] = books[j + 1]
                            }
                            books[--size] = null;
                            return true;
                        }
                    }
                    return false;
                            }
                            public void listAll() {
                                system.out.println("=== BookCatalog ===");
                                for (int i =0; i < size; i++) {
                                    system.out.println(books[i]);
                                }
                            }
                            public int size() {
                                return size;
                            }
                            public boolean IsEmpty() {
                                return size == 0;
                            }
}
