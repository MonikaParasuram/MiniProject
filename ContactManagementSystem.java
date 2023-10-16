package myproject;

	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class ContactManagementSystem{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ContactManager contactManager = new ContactManager();

	        while (true) {
	        	System.out.println("===================================================");
	            System.out.println("============Contact Management System===============");
	            System.out.println("===================================================");
	            System.out.println("1. Add Contact");
	            System.out.println("2. View All Contacts");
	            System.out.println("3. Search Contact");
	            System.out.println("4. Delete Contact");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addContact(contactManager);
	                    break;
	                case 2:
	                    viewAllContacts(contactManager);
	                    break;
	                case 3:
	                    searchContact(contactManager);
	                    break;
	                case 4:
	                    deleteContact(contactManager);
	                    break;
	                case 5:
	                    System.out.println("Thank you for using the Contact Management System. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	    }

	    private static void addContact(ContactManager contactManager) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the contact name: ");
	        String name = scanner.next();
	        System.out.print("Enter the contact phone number: ");
	        String phoneNumber = scanner.next();
	        contactManager.addContact(name, phoneNumber);
	        System.out.println("Contact added successfully!");
	    }

	    private static void viewAllContacts(ContactManager contactManager) {
	        System.out.println("All Contacts:");
	        ArrayList<Contact> contacts = contactManager.getAllContacts();
	        for (Contact contact : contacts) {
	            System.out.println(contact);
	        }
	    }

	    private static void searchContact(ContactManager contactManager) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the contact name or phone number to search: ");
	        String searchTerm = scanner.next();
	        ArrayList<Contact> searchResults = contactManager.searchContact(searchTerm);

	        if (searchResults.isEmpty()) {
	            System.out.println("No matching contacts found.");
	        } else {
	            System.out.println("Matching Contacts:");
	            for (Contact contact : searchResults) {
	                System.out.println(contact);
	            }
	        }
	    }

	    private static void deleteContact(ContactManager contactManager) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the contact name or phone number to delete: ");
	        String searchTerm = scanner.next();
	        if (contactManager.deleteContact(searchTerm)) {
	            System.out.println("Contact deleted successfully.");
	        } else {
	            System.out.println("Contact not found.");
	        }
	    }
	}



