package io.github.leofalves.products.doctorsys.model.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professional")
public class Professional implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String classDocumentType;
	private String classDocumentNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id")
	private Person personProfessional;
	
	
	public Professional() {
	}


	public Professional(Long Id, String classDocumentType, String classDocumentNumber, Person person) {
		this.Id = Id;
		this.classDocumentType = classDocumentType;
		this.classDocumentNumber = classDocumentNumber;
		this.personProfessional = person;
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


	public Person getPerson() {
		return personProfessional;
	}

	public void setPerson(Person person) {
		this.personProfessional = person;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
}
