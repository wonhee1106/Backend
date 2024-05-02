package models;

import classes.Contact;


public class ContactManager {
	private Contact[] cts = new Contact[10];
	   private int index = 0;
	   
	   public void addContact(Contact ct) {
	      this.cts[index++] = ct;
	   }
	   
	   public Contact[] getCts() {
	      return cts;
	   }
	   
	   public int getIndex() {
		   return index;
	   }
}