package Day5;

public class Customer {
    private int id;
    private int balance;

    public Customer(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
