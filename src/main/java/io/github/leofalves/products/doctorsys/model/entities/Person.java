package io.github.leofalves.products.doctorsys.model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.github.leofalves.products.doctorsys.model.entities.enums.DocumentType;

@Entity
@Table(name = "person")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer documentType;
	private Long documentNumber;
	private LocalDate birth;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	@OneToMany(mappedBy = "person")
	private List<Phone> phones = new ArrayList<Phone>();

	@JsonIgnore
	@OneToOne(mappedBy = "personProfessional")
	private Professional professional;

	@JsonIgnore
	@OneToOne(mappedBy = "personPatient")
	private Patient patient;


	public Person(Long id, String name, Long documentNumber, DocumentType documentType, LocalDate birth) {
		this.id = id;
		this.name = name;
		setDocumentType(documentType);
		this.documentNumber = documentNumber;
		this.birth = birth;
	}
	
	public Person() {

	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return DocumentType.valueOf(this.documentType);
	}

	public void setDocumentType(DocumentType documentType) {
		if(documentType != null) {
			this.documentType = documentType.getCode();
		}

	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
		

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", documentType=" + documentType + ", documentNumber="
				+ documentNumber + ", birth=" + birth + "]";
	}

	public List<Phone> getPhones() {
		return phones;
	}
		
}
