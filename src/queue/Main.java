package queue;

import queue.exceptions.EmptyQueueException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueManager manager = new QueueManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Queue System =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Call Next");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.next();

                        System.out.print("Priority? (true/false): ");
                        boolean priority = sc.nextBoolean();

                        manager.addCustomer(name, priority);
                        break;

                    case 2:
                        manager.callNext();
                        break;

                    case 3:
                        manager.showQueue();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;
                }
            } catch (EmptyQueueException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}