package queue;

import queue.exceptions.EmptyQueueException;
import java.util.*;

public class QueueManager {

    private Queue<PersonInQueue> queue = new LinkedList<>();
    private int tokenCounter = 1;

    public void addCustomer(String name, boolean isPriority) {
        PersonInQueue p;

        if (isPriority) {
            p = new PriorityCustomer(tokenCounter++, name);
        } else {
            p = new RegularCustomer(tokenCounter++, name);
        }

        queue.add(p);
        System.out.println("Token Generated: " + p.getTokenNumber());
    }

    public void callNext() throws EmptyQueueException {
        if (queue.isEmpty()) {
            throw new EmptyQueueException("Queue is empty!");
        }

        PersonInQueue p = queue.poll();
        System.out.println("Now Serving:");
        p.displayDetails();
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("\n--- Current Queue ---");
        for (PersonInQueue p : queue) {
            p.displayDetails();
        }
    }
}