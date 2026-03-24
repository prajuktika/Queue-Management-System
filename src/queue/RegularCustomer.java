package queue;

public class RegularCustomer extends PersonInQueue {

    public RegularCustomer(int tokenNumber, String name) {
        super(tokenNumber, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Token: " + tokenNumber + " | Name: " + name + " | Type: Regular");
    }
}