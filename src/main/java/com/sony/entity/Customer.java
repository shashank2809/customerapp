package com.sony.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private String customerId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "contact_name")
	private String contactName;
	@Column(name = "contact_title")
	private String contactTitle;
	private String address;
	private String city;
	private String region;
	@Column(name = "postal_code")
	private String postalCode;
	private String country;
	private String phone;
	private String fax;
}
