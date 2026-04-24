package shared;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int stock;
    private int year;

//Constructor
public Book(String,isbn, String title, String author, double price, int stock, int year){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.price = price;
    this.stock = stock;
    this.year = year;
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
public double getPrice(){
    return price;
}
public int getStock(){
    return stock;
}
public int getYear(){

}
//Method untuk menampilkan data buku
@Override
public String toString(){
    return "[" + isbn + "] " + title + " " + author + ", Rp" + price + " (stock: " + stock + ")";
}
}