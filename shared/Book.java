package shared;

public class Book {
    private String isbn;
    private String judul;
    private String penulis;
    private double harga;
    private int stok;

//Constructor
public Book(String,isbn, String judul, String penulis, double harga, int stok){
    this.isbn = isbn;
    this.judul = judul;
    this.penulis = penulis;
    this.harga = harga;
    this.stok = stok;
}
//Getter
public String getIsbn(){
    return Isbn;
}
public String getJudul(){
    return judul;
}
public String getPenulis(){
    return penulis;
}
public double getHarga(){
    return harga;
}
public int getStok(){
    return stok;
}
//Method untuk menampilkan data buku
@Override
public String toString(){
    return "[" + isbn + "] " + judul + " " + penulis + ", Rp" + harga + " (stok: " + stok + ")";
}
}