import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    public static AddressBook addressBook = new AddressBook();
    ArrayList<Person> person = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        int choice = 0;
        do {
            System.out.println("Main menu: \n1.Add Person \n2.Edit Person\n3.Delete Person\n4.Display Person.\n5.Exit");
            choice = sc.nextInt();
            addressBook.getChoice(choice);
        } while (choice != 5);
    }

    public void getChoice(int choice) {
        switch (choice) {
            case 1:
                addressBook.addPerson();
                break;
            case 2:
                addressBook.editPerson();
                break;
            case 3:
                addressBook.deletePersonDetails();
                break;
            case 4:
                addressBook.display();
                break;
            case 5:
                System.out.println("Details Not Present");
        }
    }

    public void addPerson() {
        Person person1 = new Person();
        System.out.println("Enter a First Name");
        person1.setFirstName(sc.nextLine());
        System.out.println("Enter a Last Name");
        person1.setLastName(sc.nextLine());
        System.out.println("Enter a Address ");
        person1.setAddress(sc.nextLine());
        System.out.println("Enter a city");
        person1.setCity(sc.nextLine());
        System.out.println("Enter a Email");
        person1.setEmail(sc.nextLine());
        System.out.println("Enter a zip");
        person1.setZip(sc.nextInt());
        System.out.println("Enter a Phone Number");
        person1.setPhoneNumber(sc.nextLong());
        person.add(person1);
        System.out.println("Person Details Added Successfully");
    }

    public void editPerson() {
        if (person.size() > 0) {
            String newFirstName;
            System.out.println("Enter a First Name");
            newFirstName = sc.nextLine();
            for (int i = 0; i < person.size(); i++) {
                if (person.get(i).getFirstName().equals(newFirstName)) {
                    System.out.println("Enter the edit: \n1.First Name\n2.Last Name\n3.Address\n4.City\n5.Email\n6.Zip\n7.Phone Number");
                    int input = sc.nextInt();
                    switch (input) {

                        case 1:
                            System.out.println("Enter New First Nmae");
                            person.get(i).setFirstName(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter New Last Nmae");
                            person.get(i).setLastName(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter New Address Nmae");
                            person.get(i).setAddress(sc.next());
                            break;
                        case 4:
                            System.out.println("Enter New City Nmae");
                            person.get(i).setCity(sc.next());
                            break;
                        case 5:
                            System.out.println("Enter New Email");
                            person.get(i).setEmail(sc.next());
                            break;
                        case 6:
                            System.out.println("Enter New Zip");
                            person.get(i).setZip(sc.nextInt());
                            break;
                        case 7:
                            System.out.println("Enter New Phone Number");
                            person.get(i).setPhoneNumber(sc.nextLong());
                            break;
                        default:
                            System.out.println("Not Details");
                    }
                    System.out.println("Person Edit Successfully");
                } else
                    System.out.println("Not Any Detils");
            }
        }
    }

    public void deletePersonDetails() {
        if (person.size() > 0) {
            System.out.println("Enter a First Nmae");
            String delName = sc.nextLine();
            for (int i = 0; i < person.size(); i++) {
                if (person.get(i).getFirstName().equals(delName)) {
                    Person person1 = person.get(i);
                    person.remove(person1);
                    System.out.println("Person Details Delete Successfully");
                } else {
                    System.out.println("Not contact delete");
                }
            }
        }
    }

    public void display() {
        if (person.size() > 0) {
            for (Person itr : person) {
                System.out.println(itr);
            }
        } else {
            System.out.println("Person Details");
        }
    }
}


