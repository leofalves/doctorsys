package io.github.leofalves.products.doctorsys.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "phone")
public class Phone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer DDI;
	private Integer DDD;
	private Long phoneNumber;
	private String phoneType;
	

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	
	public Phone() {
	}
	
	public Phone(Long id, Integer DDI, Integer DDD, Long phoneNumber, String phoneType, Person person) {
		this.id = id;
		this.DDI = DDI;
		this.DDD = DDD;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.person = person;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getDDI() {
		return DDI;
	}
	public void setDDI(Integer DDI) {
		this.DDI = DDI;
	}
	public Integer getDDD() {
		return DDD;
	}
	public void setDDD(Integer DDD) {
		this.DDD = DDD;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
