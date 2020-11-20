package io.github.leofalves.products.doctorsys.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@Entity
@Table(name = "patient")
public class Patient extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String healthPlan;
	
	public Patient() {
		super();
	}	

	public Patient(Long id, String name, Long documentNumber, DocumentType documentType, LocalDate birth,
			String healthPlan) {
		super(id, name, documentNumber, documentType, birth);
		this.healthPlan = healthPlan;
	}

	public String getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(String healthPlan) {
		this.healthPlan = healthPlan;
	}
}
