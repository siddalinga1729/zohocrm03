package com.zohocrm3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm3.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {
//inheritance is happening
}
