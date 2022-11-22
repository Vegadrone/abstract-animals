package org.azienda.italy;

import java.time.LocalDate;

public abstract class Person {
	
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String corpCode;
	
	public Person(String name, String surname, LocalDate dateOfBirth) {
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCorpCode() {
		return corpCode;
	}

	public void setCorpCode(String corpCode) {
		
		this.corpCode = corpCode;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname() + " (" + getCorpCode() + ")";
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {
		return getFullName() + "\nData di Nascita; " + getDateOfBirth();
	}
}
