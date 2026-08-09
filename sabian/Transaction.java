//import sabianS5.OrderDeque;


public class Transaction {
private String customerId;
private String bookIsbn;
private int quantity;
private int total;


// Constructor
public Transaction(String customerId, String bookIsbn, int quantity, int total) {
    this.customerId = customerId;
    this.bookIsbn   = bookIsbn;
    this.quantity   = quantity;
    this.total      = total;
}

// Getter
public String getCustomerId() { return customerId; }
public String getBookIsbn()   { return bookIsbn; }
public int    getQuantity()   { return quantity; }
public int    getTotal()      { return total; }


}



class OrderDeque {


private class Node {
    Transaction data;
    Node prev, next;

    public Node(Transaction data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

private Node head, tail;
private int size;

// Constructor
public OrderDeque() {
    head = null;
    tail = null;
    size = 0;
}

// Cek kosong
public boolean isEmpty() {
    return size == 0;
}

// Ukuran deque
public int size() {
    return size;
}

// Tambah di depan
public void addFront(Transaction data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev    = newNode;
        head         = newNode;
    }
    size++;
}

// Tambah di belakang
public void addRear(Transaction data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        tail.next    = newNode;
        newNode.prev = tail;
        tail         = newNode;
    }
    size++;
}

// Hapus dari depan
public void removeFront() {
    if (isEmpty()) {
        System.out.println("Deque kosong!");
        return;
    }
    System.out.println("Diproses dari depan: " + head.data.getCustomerId());
    head = head.next;
    if (head != null) {
        head.prev = null;
    } else {
        tail = null;
    }
    size--;
}

// Hapus dari belakang
public void removeRear() {
    if (isEmpty()) {
        System.out.println("Deque kosong!");
        return;
    }
    System.out.println("Dihapus dari belakang: " + tail.data.getCustomerId());
    tail = tail.prev;
    if (tail != null) {
        tail.next = null;
    } else {
        head = null;
    }
    size--;
}

// Lihat depan
public Transaction peekFront() {
    return isEmpty() ? null : head.data;
}

// Lihat belakang
public Transaction peekRear() {
    return isEmpty() ? null : tail.data;
}

// Tampilkan semua isi deque
public void display() {
    System.out.println("=== Antrian Order (Deque, " + size + " transaksi) ===");
    System.out.print("Depan  ");
    Node current = head;
    while (current != null) {
        System.out.print("[" + current.data.getCustomerId() + "] Rp"
            + String.format("%,d", current.data.getTotal()).replace(",", "."));
        if (current.next != null) {
            System.out.print(" | ");
        }
        current = current.next;
    }
    System.out.println("    Belakang");
}
}



class Main {


public static void main(String[] args) {
    OrderDeque deque = new OrderDeque();

    // Tambah data
    deque.addRear(new Transaction("C001", "978-1", 2, 170000));
    deque.addRear(new Transaction("C002", "978-2", 1, 95000));
    deque.addFront(new Transaction("C003", "978-3", 5, 395000));

    // Tampilkan isi deque
    deque.display();

    // Lihat depan & belakang
    System.out.println("Depan    : " + deque.peekFront().getCustomerId());
    System.out.println("Belakang : " + deque.peekRear().getCustomerId());

    // Hapus dari belakang
    deque.removeRear();

    // Tampilkan setelah penghapusan
    deque.display();
}
}
