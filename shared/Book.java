public class Book {
    String isbn;
    String title;
    String author;
    double price;
    int stock;

    public Book(String isbn, String title, String author, double price, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return title + " - " + author + " | (Stock: " + stock + ");
=======
        return "[BOOK] " + title + " | Author: " + author + " | Price: " + price;
>>>>>>> feature-update-book
    }
}