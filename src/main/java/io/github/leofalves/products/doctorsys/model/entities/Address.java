package io.github.leofalves.products.doctorsys.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "address")
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long zipCode;
	private String lineAddress1;
	private String lineAddress2;
	private String lineAddress3;
	private String city;
	private String state;
	private String country;
	
	@JsonIgnore
	@OneToOne(mappedBy = "address")
	private Person person;

	
	public Address() {
	}

	public Address(Long id, Long zipCode, String lineAddress1, String lineAddress2, String lineAddress3, String city,
			String state, String country) {
		super();
		this.id = id;
		this.zipCode = zipCode;
		this.lineAddress1 = lineAddress1;
		this.lineAddress2 = lineAddress2;
		this.lineAddress3 = lineAddress3;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getLineAddress1() {
		return lineAddress1;
	}

	public void setLineAddress1(String lineAddress1) {
		this.lineAddress1 = lineAddress1;
	}

	public String getLineAddress2() {
		return lineAddress2;
	}

	public void setLineAddress2(String lineAddress2) {
		this.lineAddress2 = lineAddress2;
	}

	public String getLineAddress3() {
		return lineAddress3;
	}

	public void setLineAddress3(String lineAddress3) {
		this.lineAddress3 = lineAddress3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Person getPerson() {
		return person;
	}


}
