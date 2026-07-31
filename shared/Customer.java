public class Customer {
    private String customerId;
    private String name;

    // Constructor untuk membuat objek Customer baru
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getter untuk mengambil ID Customer
    public String getCustomerId() {
        return customerId;
    }

    // Getter untuk mengambil Nama Customer
    public String getName() {
        return name;
    }
}