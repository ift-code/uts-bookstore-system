public class Transaction {
    private String transactionId;
    private Customer customer;
    private Book[] books;
    private int bookCount;
    private static final int INITIAL_CAPACITY = 5;

    // Constructor
    public Transaction(String transactionId, Customer customer) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.books = new Book[INITIAL_CAPACITY];
        this.bookCount = 0;
    }

    // Fungsi untuk menambahkan buku ke dalam transaksi (menggunakan dynamic array manual)
    public void addBook(Book book) {
        if (bookCount == books.length) {
            // Resize array jika penuh tanpa menggunakan library java.util
            Book[] newBooks = new Book[books.length * 2];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            books = newBooks;
        }
        books[bookCount] = book;
        bookCount++;
    }

    // Getter untuk ID Transaksi
    public String getTransactionId() {
        return transactionId;
    }

    // Getter untuk data Customer
    public Customer getCustomer() {
        return customer;
    }

    // Getter untuk mengambil array buku yang dibeli
    public Book[] getBooks() {
        // Mengembalikan array sesuai dengan jumlah buku yang benar-benar ada
        Book[] activeBooks = new Book[bookCount];
        System.arraycopy(books, 0, activeBooks, 0, bookCount);
        return activeBooks;
    }

    public int getBookCount() {
        return bookCount;
    }

    // Mengubah data transaksi menjadi teks rapi saat dicetak
    @Override
    public String toString() {
        String result = "[Transaction ID: " + transactionId + "]\n" +
                        " Pelanggan: " + (customer != null ? customer.getName() : "Anonim") + "\n" +
                        " Daftar Buku:\n";
        for (int i = 0; i < bookCount; i++) {
            result += "   - " + books[i].toString() + "\n";
        }
        return result;
    }
}