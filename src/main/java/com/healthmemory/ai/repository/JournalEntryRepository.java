package com.healthmemory.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.healthmemory.ai.model.JournalEntry;

public interface JournalEntryRepository 
	extends MongoRepository<JournalEntry, String> {

}
