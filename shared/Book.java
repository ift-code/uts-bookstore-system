package shared;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int stock;

//Constructor
public Book(String,isbn, String title, String author, double price, int stock){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.price = price;
    this.stock = stock;
}
//Getter
public String getIsbn(){
    return Isbn;
}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public double getHarga(){
    return price;
}
public int getStock(){
    return stock;
}
//Method untuk menampilkan data buku
@Override
public String toString(){
    return "[" + isbn + "] " + title + " " + author + ", Rp" + price + " (stock: " + stock + ")";
}
}