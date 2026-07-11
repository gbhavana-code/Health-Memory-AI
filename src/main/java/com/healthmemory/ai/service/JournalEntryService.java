package com.healthmemory.ai.service;

import org.springframework.stereotype.Service;

import com.healthmemory.ai.model.JournalEntry;
import com.healthmemory.ai.repository.JournalEntryRepository;

@Service
public class JournalEntryService {
	private final JournalEntryRepository repository;
	public JournalEntryService(JournalEntryRepository repository) {
		this.repository = repository;
	}
	public JournalEntry saveEntry(JournalEntry entry) {
	    return repository.save(entry);
	}

	
}
 