package com.sppu.projectname.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddmissionForm {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String sname,contact,city;

}
