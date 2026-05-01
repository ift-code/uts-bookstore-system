class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    // Menambahkan data ke belakang queue
    public void enqueue(Object data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Menghapus data dari depan queue
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }

        Object removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    // Melihat data paling depan
    public Object peek() {
        if (isEmpty()) {
            return null;
        }

        return front.data;
    }

    // Mengecek apakah queue kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Menghitung jumlah data
    public int size() {
        return size;
    }

    // Menampilkan isi queue
    public void displayQueue() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class CustomerServiceQueue {

    public static void main(String[] args) {

        Queue q = new Queue();

        // Menambahkan data
        q.enqueue("Customer A");
        q.enqueue("Customer B");
        q.enqueue("Customer C");

        // Menampilkan isi queue
        System.out.println("Isi Queue:");
        q.displayQueue();

        // Menghapus data
        System.out.println("\nDequeue: " + q.dequeue());

        // Menampilkan queue setelah dequeue
        System.out.println("\nIsi Queue setelah dequeue:");
        q.displayQueue();

        // Melihat data paling depan
        System.out.println("\nPeek: " + q.peek());

        // Menampilkan jumlah data
        System.out.println("Size: " + q.size());

        // Mengecek queue kosong atau tidak
        System.out.println("Is Empty: " + q.isEmpty());
    }
}
