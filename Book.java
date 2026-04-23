public class Book {
    String isbn;
    String title;
    String author;
    double price;
    int stock;

    public Book(String isbn,String title, String author, double price, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return title + "by" + author + " (ISBN: " + isbn + "Price: " + price + "Stock: " + stock + ")";
    }
}
