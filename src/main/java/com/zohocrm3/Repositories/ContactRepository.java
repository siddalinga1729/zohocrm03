package com.zohocrm3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm3.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is happening
}
