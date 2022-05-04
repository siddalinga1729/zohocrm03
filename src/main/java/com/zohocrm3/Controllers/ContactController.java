package com.zohocrm3.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm3.Services.ContactServices;
import com.zohocrm3.Services.LeadServices;
import com.zohocrm3.entities.Contact;
import com.zohocrm3.entities.Lead;

@Controller
public class ContactController {
@Autowired
private LeadServices leadServices;
	@Autowired
	private ContactServices contactServ;
	@RequestMapping("convert")
	public String convertLead(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadServices.getById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactServ.saveContact(contact);
		leadServices.deleteLead(id);
		List<Contact> contacts = contactServ.getAllContact();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
}
