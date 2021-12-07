import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Entry> entryList = new ArrayList<Entry>();
    static Scanner input = new Scanner(System.in);

    // case 1: adds an entry
    private static void addEntry() {
        Entry entry = new Entry();

        System.out.print("\nFirst Name: ");
        entry.setFirstName(input.nextLine());
        System.out.print("Last Name: ");
        entry.setLastName(input.nextLine());
        System.out.print("Phone Number: ");
        entry.setPhoneNumber(input.nextLine());
        System.out.print("Email Address: ");
        entry.setEmailAddress(input.nextLine());

        entryList.add(entry);
    }

    // case 2: removes an entry (needed iterator b/ ConcurrentModificationException)
    private static void removeEntry() {
        System.out.println("\nEnter an entry's email to remove: ");
        String emailAddress = input.nextLine();

        for (Iterator<Entry> itr = entryList.iterator(); itr.hasNext();) {
                    Entry ele = itr.next();
                if (ele.emailAddress.equals(emailAddress)) {
                    System.out.println("\nDeleted the following entry: ");
                        System.out.println("\n*******************");
                        System.out.println("First Name: " + ele.firstName);
                        System.out.println("Last Name: " + ele.lastName);
                        System.out.println("Phone Number: " + ele.phoneNumber);
                        System.out.println("Email address: " + ele.emailAddress);
                        System.out.println("*******************");
                    entryList.remove(ele);
                } 
        }
    }

    // case 3: searches database
    private static void searchEntry() {
        boolean searched = false;
        while(!searched) {
            System.out.println("\n1) First Name");
            System.out.println("2) Last Name");
            System.out.println("3) Phone Number");
            System.out.println("4) Email Address");
            System.out.print("Choose a search type: ");
            int searchNum = Integer.parseInt(input.nextLine());
            System.out.print("Enter your search: "); 
            String search = input.nextLine();
            if (searchNum > 0 && searchNum < 5) {
                ArrayList<Entry> searchedEntry = new ArrayList<>();
                for (Iterator<Entry> itr = entryList.iterator(); itr.hasNext();) {
                    Entry ele = itr.next();
                    switch (searchNum) {
                        case 1:
                        if(ele.firstName.startsWith(search)) {
                            searchedEntry.add(ele);
                        }
                        break;
                        case 2:
                        if (ele.lastName.startsWith(search)) {
                            searchedEntry.add(ele);
                        }
                        break;
                        case 3:
                        if (ele.phoneNumber.startsWith(search)) {
                            searchedEntry.add(ele);
                        }
                        break;
                        case 4:
                        if (ele.emailAddress.startsWith(search)) {
                            searchedEntry.add(ele);
                        }
                        break;
                    }
                }
                for (Entry ele : searchedEntry) {
                    System.out.println("\n*******************");
                    System.out.println("First Name: " + ele.getFirstName());
                    System.out.println("Last Name: " + ele.getLastName());
                    System.out.println("Phone Number: " + ele.getPhoneNumber());
                    System.out.println("Email address: " + ele.getEmailAddress());
                    System.out.println("*******************");
                }

                searched = true;
            } else {
                System.out.println("Please input a proper search type(1-4)");
            }
        }
    }

    // case 4: prints ArrayList of address book
    private static void printContents() {
        if (!entryList.isEmpty()) {
            int count = 1;
            for (Entry ele : entryList) {
                System.out.println("\n*******************");
                System.out.println("Entry " + count);
                System.out.println("First Name: " + ele.getFirstName());
                System.out.println("Last Name: " + ele.getLastName());
                System.out.println("Phone Number: " + ele.getPhoneNumber());
                System.out.println("Email address: " + ele.getEmailAddress());
                System.out.println("*******************");
                count++;
            }
        } else {
            System.out.println("\nThe address book is empty!");
        }
    }

    // case 5: delete book
    private static void deleteAddressBook() {
        entryList.clear();
        System.out.println("\nAddress book cleared!");
    }

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n1) Add an entry");
            System.out.println("2) Remove an entry");
            System.out.println("3) Search for a specific entry");
            System.out.println("4) Print Address Book");
            System.out.println("5) Delete Entire Address Book");
            System.out.println("6) Quit");
            System.out.print("\nPlease choose what you'd like to do with the database: ");
            int response = Integer.parseInt(input.nextLine());

            switch (response) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    removeEntry();
                    break;
                case 3:
                    searchEntry();
                    break;
                case 4:
                    printContents();
                    break;
                case 5:
                    deleteAddressBook();
                    break;
                case 6:
                    isRunning = false; // cancel while loop to end program
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }

}
