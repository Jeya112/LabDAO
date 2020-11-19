package com.cg.healthassist.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Laboratory{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laboratoryId;
	private String laboratoryName;
	@ElementCollection
	@JoinTable(name="Laboratory_Docotr", joinColumns = @JoinColumn(name="laboratory_id"))
	private  List<Doctor> doctorList;
    private  List<String> medicalTestList;
	
 	public Laboratory() {
		super();
	}

	public Laboratory(String laboratoryName, List<Doctor> doctorList, List<String> medicalTestList) {
		super();
		this.laboratoryName = laboratoryName;
		this.doctorList = doctorList;
		this.medicalTestList = medicalTestList;
	}

	public int getLaboratoryId() {
		return laboratoryId;
	}

	public void setLaboratoryId(int laboratoryId) {
		this.laboratoryId = laboratoryId;
	}

	public String getLaboratoryName() {
		return laboratoryName;
	}

	public void setLaboratoryName(String laboratoryName) {
		this.laboratoryName = laboratoryName;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public List<String> getMedicalTestList() {
		return medicalTestList;
	}

	public void setMedicalTestList(List<String> medicalTestList) {
		this.medicalTestList = medicalTestList;
	}

	@Override
	public String toString() {
		return "Laboratory [laboratoryName=" + laboratoryName + ", doctorList=" + doctorList + ", medicalTestList="
				+ medicalTestList + "]";
	}
	
	
 	
 	
	
	
 	
	
 	

	
	
}
