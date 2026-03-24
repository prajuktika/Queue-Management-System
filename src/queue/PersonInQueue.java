package queue;

public abstract class PersonInQueue {
    protected int tokenNumber;
    protected String name;

    public PersonInQueue(int tokenNumber, String name) {
        this.tokenNumber = tokenNumber;
        this.name = name;
    }

    public int getTokenNumber() {
        return tokenNumber;
    }

    public abstract void displayDetails();
}