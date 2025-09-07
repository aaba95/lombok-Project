package com.cjc.app;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	private int rollno;
	private String name;

	
}
