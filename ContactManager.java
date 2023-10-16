package myproject;

	import java.util.ArrayList;
	
	public class ContactManager {

	
	    private ArrayList<Contact> contacts = new ArrayList<>();

	    public void addContact(String name, String phoneNumber) {
	        Contact contact = new Contact(name, phoneNumber);
	        contacts.add(contact);
	    }

	    public ArrayList<Contact> getAllContacts() {
	        return contacts;
	    }

	    public ArrayList<Contact> searchContact(String searchTerm) {
	        ArrayList<Contact> searchResults = new ArrayList<>();
	        for (Contact contact : contacts) {
	            if (contact.getName().contains(searchTerm) || contact.getPhoneNumber().contains(searchTerm)) {
	                searchResults.add(contact);
	            }
	        }
	        return searchResults;
	    }

	    public boolean deleteContact(String searchTerm) {
	        Contact contactToDelete = null;
	        for (Contact contact : contacts) {
	            if (contact.getName().contains(searchTerm) || contact.getPhoneNumber().contains(searchTerm)) {
	                contactToDelete = contact;
	                break;
	            }
	        }
	        if (contactToDelete != null) {
	            contacts.remove(contactToDelete);
	            return true;
	        }
	        return false;
	    }
	}



