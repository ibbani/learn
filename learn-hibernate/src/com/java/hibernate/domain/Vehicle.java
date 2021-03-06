package com.java.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Least normalized
//@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("VEHICLE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Slightly more normalized
// @Inheritance(strategy = InheritanceType.JOINED) // Highly normalized but performance is not good
public class Vehicle {

	private long id;
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
