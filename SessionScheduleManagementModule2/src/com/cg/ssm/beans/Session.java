package com.cg.ssm.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ScheduledSessions")
public class Session {
	//Fields of the ScheduledSessions table
	@Id
	private int id;
	private String name;
	private int duration;
	private String faculty;
	private String mode1;

	//Constructors for the Session bean
	public Session() {
		super();
	}
	public Session(int id) {
		super();
		this.id = id;
	}
	public Session(int id, String name, int duration, String faculty, String mode1) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}

	//Getters and Setters for the Session bean
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMode1() {
		return mode1;
	}
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	@Override
	public String toString() {
		return "Session [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty + ", mode1="
				+ mode1 + "]";
	}
	
	
}
