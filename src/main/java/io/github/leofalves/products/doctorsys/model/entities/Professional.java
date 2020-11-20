package io.github.leofalves.products.doctorsys.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@Entity
@Table(name = "professional")
public class Professional extends Person{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String classDocumentType;
	private String classDocumentNumber;
	
	
	public Professional() {
		super();
	}
	
	public Professional(Long id, String name, Long documentNumber, DocumentType documentType, LocalDate birth,
			String classDocumentType, String classDocumentNumber) {
		super(id, name, documentNumber, documentType, birth);
		this.classDocumentType = classDocumentType;
		this.classDocumentNumber = classDocumentNumber;
	}



	public String getClassDocumentType() {
		return classDocumentType;
	}
	public void setClassDocumentType(String classDocumentType) {
		this.classDocumentType = classDocumentType;
	}
	public String getClassDocumentNumber() {
		return classDocumentNumber;
	}
	public void setClassDocumentNumber(String classDocumentNumber) {
		this.classDocumentNumber = classDocumentNumber;
	}
		
}
