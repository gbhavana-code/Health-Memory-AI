package com.healthmemory.ai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthmemory.ai.model.JournalEntry;
import com.healthmemory.ai.service.JournalEntryService;

@RestController
@RequestMapping("/api/journal")
public class JournalEntryController {

    private final JournalEntryService service;

    public JournalEntryController(JournalEntryService service) {
        this.service = service;
    }

    @PostMapping
    public JournalEntry saveJournal(@RequestBody JournalEntry entry) {
        return service.saveEntry(entry);
    }
}