package com.zohocrm3.Services;

import java.util.List;

import com.zohocrm3.entities.Lead;

public interface LeadServices {
public void saveLead(Lead lead);

public List<Lead> getAllLead();

public Lead getById(int id);

public void deleteLead(int id);
}
