📚 Bookstore Inventory & Sales System

---

📌 Tentang Aplikasi

Bookstore Inventory & Sales System adalah aplikasi berbasis console yang dikembangkan menggunakan Java.
Aplikasi ini digunakan untuk mengelola data buku, pelanggan, dan transaksi penjualan dalam sebuah toko buku.

Sistem ini mensimulasikan proses nyata seperti pengelolaan stok buku, pelayanan pelanggan, hingga pencatatan transaksi penjualan.

Project ini juga bertujuan untuk menerapkan konsep Object-Oriented Programming (OOP) serta berbagai struktur data.

---

🎯 Kegunaan Aplikasi

Fitur | Deskripsi
Manajemen Buku | Mengelola data buku menggunakan Dynamic Array
Antrian Customer | Mengatur antrian pelanggan menggunakan Queue (FIFO)
Riwayat Transaksi | Menyimpan histori transaksi menggunakan Stack (LIFO)
Kategori Buku | Mengelompokkan buku berdasarkan genre menggunakan HashMap
Manajemen Order | Mengelola pesanan menggunakan Deque

---

👥 Anggota Kelompok

No | Nama | Role (UTS)

S1 | Ibnu Fatih Hidayat | Dynamic Array — "BookCatalog.java"

S2 | Maulana Septian | Queue — "CustomerServiceQueue.java"

S3 | Muhammad Wafiq Robbani | Stack — "SalesUndoStack.java"

S4 | Rishy Khoerunnisa | HashMap — "GenreIndex.java"

S5 | Sabian Mugis Pratama | Deque — "OrderDeque.java"

---

📦 Struktur Project


---

🧩 Penjelasan Modul Per Individu

👤 S1 — BookCatalog.java (Dynamic Array)

Modul ini mengelola data buku menggunakan struktur data Dynamic Array (ArrayList).
Digunakan untuk menyimpan dan memanipulasi data buku secara fleksibel.

Fungsi utama:

- addBook → menambahkan buku
- removeBook → menghapus buku berdasarkan ISBN
- findByIsbn → mencari buku berdasarkan ISBN
- findByTitle → mencari buku berdasarkan judul
- listAll → menampilkan seluruh data buku
- size → menghitung jumlah data
- isEmpty → mengecek apakah kosong

---

👤 S2 — CustomerServiceQueue.java (Queue - Linked Nodes)

Modul ini mengelola antrian pelanggan menggunakan konsep Queue (FIFO).
Customer yang datang lebih dulu akan dilayani lebih dulu.

---

👤 S3 — SalesUndoStack.java (Stack - Linked Nodes)

Modul ini menyimpan riwayat transaksi menggunakan Stack (LIFO).
Transaksi terakhir dapat di-undo terlebih dahulu.

---

👤 S4 — GenreIndex.java (HashMap - Array + Chaining)

Modul ini mengelompokkan buku berdasarkan genre menggunakan HashMap.
Mempermudah pencarian buku berdasarkan kategori.

---

👤 S5 — OrderDeque.java (Deque - Doubly Linked List)

Modul ini mengelola data pesanan menggunakan Deque.
Data bisa ditambahkan atau dihapus dari depan maupun belakang.

---

🎥 Video Deliverables

- Video penjelasan sistem
- Video penjelasan modul masing-masing anggota
- Video live coding
- Video Git workflow (commit & push)

---

🚀 Cara Menjalankan

1. Clone repository
2. Buka di Visual Studio Code
3. Jalankan "Main.java"

---

📌 Catatan

Project ini dibuat untuk memenuhi tugas UTS dan sebagai latihan implementasi struktur data serta OOP dalam Java.
