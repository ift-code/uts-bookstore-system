📚 Bookstore System (UTS)

📖 Tentang Aplikasi

Aplikasi ini merupakan sistem sederhana untuk mengelola toko buku, yang mencakup data buku, pelanggan, dan transaksi.
Dikembangkan menggunakan bahasa Java dengan pendekatan Object-Oriented Programming (OOP) serta penerapan struktur data.

---

🎯 Kegunaan Aplikasi

- Mengelola data buku (tambah, hapus, cari)
- Menyimpan data pelanggan
- Mencatat transaksi pembelian
- Mengimplementasikan struktur data Dynamic Array (ArrayList)

---

👥 Anggota Kelompok

- S1 – Ibnu (BookCatalog - Dynamic Array)
- S2 – (isi nama & tugas)
- S3 – (isi nama & tugas)
- S4 – (isi nama & tugas)
- S5 – (isi nama & tugas)

---

🧩 Struktur Project

src/
 ├── model/      → Data class (Book, Customer, Transaction)
 ├── module/     → Logic program (BookCatalog, dll)
 └── main/       → Testing (Main.java)

---

⚙️ Penjelasan Modul

🔹 S1 – BookCatalog (Dynamic Array)
Mengelola data buku menggunakan struktur data dynamic array (ArrayList).
Fitur:
Menambahkan buku (addBook)
Menghapus buku berdasarkan ISBN (removeBook)
Mencari buku berdasarkan ISBN (findByIsbn)
Mencari buku berdasarkan judul (findByTitle)
Menampilkan seluruh data buku (listAll)
Menghitung jumlah data (size)
Mengecek apakah data kosong (isEmpty)
---
🔹 S2 – CustomerServiceQueue (Queue - Linked Nodes)
Mengelola antrian customer menggunakan struktur data queue berbasis linked list.
Fitur:
Menambahkan ke antrian (enqueue)
Menghapus dari antrian (dequeue)
Melihat antrian terdepan (peek)
Mengecek apakah antrian kosong (isEmpty)
Menghitung jumlah antrian (size)
Menampilkan seluruh antrian (displayQueue)
---
🔹 S3 – SalesUndoStack (Stack - Linked Nodes)
Mengelola riwayat transaksi menggunakan struktur data stack berbasis linked list.
Fitur:
Menambahkan data ke stack (push)
Menghapus data terakhir (pop)
Melihat data teratas (peek)
Mengecek apakah stack kosong (isEmpty)
Menghitung jumlah data (size)
Menampilkan riwayat (displayHistory)
---
🔹 S4 – GenreIndex (HashMap - Array + Chaining)
Mengelola kategori buku berdasarkan genre menggunakan struktur data HashMap.
Fitur:
Menambahkan buku ke genre (addBook)
Mengambil daftar buku dalam genre (getBooksInGenre)
Menghapus genre (removeGenre)
Menampilkan semua genre (listGenres)
Menghitung jumlah genre (size)
---
🔹 S5 – OrderDeque (Deque - Doubly Linked List)
Mengelola data pesanan menggunakan struktur data deque berbasis doubly linked list.
Fitur:
Menambahkan data di depan (addFront)
Menambahkan data di belakang (addRear)
Menghapus dari depan (removeFront)
Menghapus dari belakang (removeRear)
Melihat data depan (peekFront)
Melihat data belakang (peekRear)
Mengecek apakah kosong (isEmpty)
Menghitung jumlah data (size)
Menampilkan seluruh data (display)


🎥 Video Deliverables

- Video penjelasan sistem (overview aplikasi)
- Video penjelasan modul masing-masing anggota
- Video live coding implementasi
- Video Git workflow (commit & push)

---

🚀 Cara Menjalankan

1. Clone repository
2. Buka project di VS Code
3. Jalankan file "Main.java"

---

📌 Catatan

Project ini dibuat untuk memenuhi tugas UTS dan berfokus pada pemahaman konsep Object-Oriented Programming (OOP) serta struktur data.
