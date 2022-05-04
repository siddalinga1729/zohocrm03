package com.zohocrm3.Services;

import java.util.List;

import com.zohocrm3.entities.Contact;

public interface ContactServices {
public void saveContact(Contact contact);

public List<Contact> getAllContact();

public Contact getById(int id);
}
