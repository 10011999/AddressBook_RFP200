import com.sun.org.apache.bcel.internal.generic.FieldInstruction;

import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    public static AddressBook addressBook = new AddressBook();

    //Person person = new Person();
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        int choice = 0;
        //AddressBook addressBook = new AddressBook();
        do {
            System.out.println("Main menu: \n1.Add Person \n2.Delete Person\n3.Display Person\n4.Update Person.\n5.Exit");
            choice = sc.nextInt();
            addressBook.getChoice(choice);
        } while (choice != 5);
    }

    public void getChoice(int choice) {
        switch (choice) {
            case 1:
                addressBook.add();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Not Any Details");
        }
    }


    public void add() {
        System.out.println("Enter a First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter a Last Nmae");
        String lastName = sc.nextLine();
        System.out.println("Enter a Address ");
        String address = sc.nextLine();
        System.out.println("Enter a city");
        String city = sc.nextLine();
        System.out.println("Enter a Email");
        String email = sc.nextLine();
        System.out.println("Enter a zip");
        int zip = sc.nextInt();
        System.out.println("Enter a Phone Number");
        long phoneNumber = sc.nextLong();
        Person person = new Person(firstName, lastName, address, city, email, zip, phoneNumber);
        System.out.println(person);
    }
}
