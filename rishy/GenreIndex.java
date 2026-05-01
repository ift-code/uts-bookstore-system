public class GenreIndex {
    private class BookNode {
        Book book;
        BookNode next;

        BookNode(Book book) {
            this.book = book;
        }
    }

    private class Entry {
    String genre;
    BookNode bookHead; //Kepala list buku
    int bookCount; //Menghitung jumlah buku dalam genre ini
    Entry next; //Pointer untuk collision di bucket yang sama
            
    Entry(String genre) {
        this.genre = genre;
        this.bookCount = 0;
        }
    }
    
    private Entry[] buckets;
    private int capacity;
    private int genreSize;

    public GenreIndex(int capacity) {
        this.capacity = capacity;
        this.buckets = new Entry[capacity];
        this.genreSize = 0;
    }

    private int getIndex(String genre) {
        return (genre == null) ? 0 : Math.abs(genre.hashCode()) % capacity;
    }

    //FEATUR: addBook (Menambahkan buku ke dalam genre)
    public void addBook(String genre, Book book) {
        int index = getIndex(genre);
        Entry currentEntry = buckets[index];

    //Cari apakah genre sudah ada
        while (currentEntry != null) {
            if (currentEntry.genre.equalsIgnoreCase(genre)) {
                addBookToEntry(currentEntry, book) ;
                return;
            }
            currentEntry = currentEntry.next;
        }

        //Jika genre baru, buat Entry bary dan pasang di depan bucket (chaining)
        Entry newEntry = new Entry(genre);
        addBookToEntry(newEntry, book);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        genreSize++;
    }
     
    //helper untuk menambahkan buku ke dalam list internal Entry
    private void addBookToEntry(Entry entry, Book book) {
        BookNode newNode = new BookNode(book);
        newNode.next = entry.bookHead;
        entry.bookHead = newNode;
        entry.bookCount++;
    }

    //FEATURE: getBookInGenre
    public void getBooksInGenre(String genre) {
        int index = getIndex(genre);
        Entry current = buckets[index];

        while (current != null) {
            if (current.genre.equalsIgnoreCase(genre)) {
                System.out.println("=== Jadwal Buku Genre: " + current.genre + " ===");
                BookNode temp = current.bookHead;
                int i = 1;
                while (temp != null) {
                    System.out.println(i + "." +temp.book.toString());
                    temp = temp.next;
                    i++;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak ditemukan genre: " + genre);
    }

    //FEATURE: removeGenre
    public void removeGenre(String genre) {
        int index = getIndex(genre);
        Entry current = buckets[index];
        Entry prev = null;

        while (current != null) {
            if (current.genre.equalsIgnoreCase(genre)) {
                if (prev == null) buckets[index] = current.next;
                else prev.next = current.next;

                genreSize--;
                System.out.println("Genre " + genre + "berhasil dihapus.");
                return;
            }
            prev = current.next;
        }
        System.out.println("Gagal menghapus: " + genre + "tidak ditemukan.");
    }

    //FEATURE: listGenres
    public void listGenres() {
        System.out.println("=== Daftar Genre ===");
        for (int i = 0; i < capacity; i++) {
            Entry e = buckets[i];
            while (e != null) {
                System.out.println("- " + e.genre + ":" + e.bookCount + "buku");
                e = e.next;
            }
        }
    }

    //FEATURE: size
    public int size() {
        return genreSize;
    }

    public static void main(String[] args) {
        GenreIndex index = new GenreIndex(10);
        //1. Add Data [3]
        index.addBook("Fiksi", new  Book("978-1", "Laskar Pelangi ", " Andreana Hirata", 85000, 10));
        index.addBook("Fiksi", new Book("978-3", "Negeri 5 Menara ", " Ahmad Fuadi", 79000, 8));
        index.addBook("Sejarah", new Book("978-2", "Bumi Manusia ", " Pramoedya A.T.", 95000, 5));
        index.listGenres();
        index.getBooksInGenre("Fiksi");
        index.removeGenre("Sejarah");
        index.getBooksInGenre("Sejarah"); //harusnya tidak ditemukan
    }
}
