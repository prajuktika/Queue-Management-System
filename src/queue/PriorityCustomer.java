package queue;

public class PriorityCustomer extends PersonInQueue {

    public PriorityCustomer(int tokenNumber, String name) {
        super(tokenNumber, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Token: " + tokenNumber + " | Name: " + name + " | Type: Priority");
    }
}