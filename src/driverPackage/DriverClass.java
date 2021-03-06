package driverPackage;


import customer.Customer;
import queue.CustomerQueue;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the essentials details to enter into the market" + '\n');
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("Enter your mobile number: It must be in the form 91-XXXXXXXXXX");
            String mobNumber = scanner.nextLine().trim();
            System.out.println(mobNumber.matches("^91-[1-9][0-9]{9}$"));
            while (true) {
                if (mobNumber.matches("^91-[1-9][0-9]{9}$")) {
                    break;
                } else {
                    System.out.println("Enter your phone number again: your mob number should not start with 0");
                }
                mobNumber = scanner.nextLine();
            }
            System.out.println("Enter your gender in a single character:");
            char gender = scanner.next().charAt(0);
            System.out.println("Enter your city:");
            scanner.next();
            String city = scanner.nextLine();
            System.out.println("Whether you are infected or not: true or false as it is.");
            boolean isInfected = scanner.nextBoolean();
            System.out.println("Whether you are aware of infection");
            boolean isAwareOfInfection = scanner.nextBoolean();
            System.out.println("Whether aware of social distancing");
            boolean isAwareOfSocialDistancing = scanner.nextBoolean();
            if (isInfected) {
                System.out.println("Hospitalised");
            } else if (isAwareOfInfection) {
                System.out.println("Quarantine");
            } else {
                if (!isAwareOfSocialDistancing) {
                    customerQueue.enqueue(new Customer(name, gender, mobNumber, city, isInfected, isAwareOfInfection, isAwareOfSocialDistancing));
                } else {
                    for (int i = 0; i <= 2; i++) {
                        customerQueue.enqueue(null);
                    }
                    customerQueue.enqueue(new Customer(name, gender, mobNumber, city, isInfected, isAwareOfInfection, isAwareOfSocialDistancing));
                }
            }
            System.out.println("Do you want to add other Customer: 1 for no or 0 for yes");
            int choice = scanner.nextInt();
            if (choice==1) {
                break;
            }
        }
        while(!customerQueue.isEmpty()){
            customerQueue.display();
            customerQueue.dequeue();
            System.out.println("-------------------------------------------");
        }
    }
}
