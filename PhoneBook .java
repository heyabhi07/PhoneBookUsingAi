import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String number;
    String email;

    Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Email: " + email);
        System.out.println();
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Number: ");
                String number = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                contacts.add(new Contact(name, number, email));
            } else if (choice == 2) {
                for (Contact c : contacts) {
                    c.display();
                }
            } else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String searchName = scanner.nextLine();
                boolean found = false;
                for (Contact c : contacts) {
                    if (c.name.equalsIgnoreCase(searchName)) {
                        c.display();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                }
            }
        } while (choice != 4);
    }
}
