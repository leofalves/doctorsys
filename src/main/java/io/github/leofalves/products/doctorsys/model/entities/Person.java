package io.github.leofalves.products.doctorsys.model.entities;

import java.io.Serializable;
import java.time.LocalDate;

import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private DocumentType documentType;
	private Long documentNumber;
	private LocalDate birth;


	public Person(Integer id, String name, Long documentNumber, DocumentType documentType, LocalDate birth) {
		this.id = id;
		this.name = name;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.birth = birth;
	}
	
	public Person() {

	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(Long documentNumber) {
		this.documentNumber = documentNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", documentType=" + documentType + ", documentNumber="
				+ documentNumber + ", birth=" + birth + "]";
	}
	
	
	
}
