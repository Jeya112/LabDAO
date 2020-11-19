package com.cg.healthassist.model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Doctor {
	private String doctorName;
	private String specialization;
	private String department;
	private long doctorPhoneNumber;
	
	public Doctor() {
		super();
	}
	
	public Doctor(String doctorName, String specialization, String department, long doctorPhoneNumber) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.department = department;
		this.doctorPhoneNumber = doctorPhoneNumber;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}
	public void setDoctorPhoneNumber(long doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + ", department=" + department
				+ ", doctorPhoneNumber=" + doctorPhoneNumber + "]";
	}
	
	
	
	
	
	
	
	

}
