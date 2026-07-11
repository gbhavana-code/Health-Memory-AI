package com.healthmemory.ai.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;
@Data
@Document(collection = "journal_entries")




public class JournalEntry {
	// JournalEntry

	// id

	// userId

	// date

	// sleep
	// hours
	// quality

	// mental health
	// mood
	// stressLevel
	// energyLevel

	// physical health
	// symptoms


	// lifestyle
	// waterIntake
	// exerciseMinutes
	// screenTimeHours
	@Id
	private String id;

	private String userId;

	private LocalDate date;

	private int sleepHours;

	private int sleepQuality;

	private String mood;

	private int stressLevel;

	private int energyLevel;

	private List<String> symptoms;

	private double waterIntake;

	private int exerciseMinutes;

	private double screenTimeHours;

	private String notes;

	}
