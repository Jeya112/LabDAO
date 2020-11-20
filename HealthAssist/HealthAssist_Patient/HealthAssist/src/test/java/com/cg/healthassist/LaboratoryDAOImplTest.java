package com.cg.healthassist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.healthassist.daoimpl.LaboratoryDAOImpl;
import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.model.Laboratory;


public class LaboratoryDAOImplTest {
	
	/*
	 * Instance of an implemented  Laboratory dao.
	 */
	private static LaboratoryDAOImpl laboratoryDao;
	/**
	 * Run once before running any test cases and create a new instance of Laboratory dao.
	 */
	@BeforeClass
	public static void runOnce()
	{
	  laboratoryDao = new LaboratoryDAOImpl();
	}
	
	/**
	 * Test the persist method 
	 */
	@Test
	public void test_Persist_GivenLaboratory() 
	{
		Doctor doctor1 = new Doctor("Anil","Cardiologist","Cardiology",98272L);
		Doctor doctor2 = new Doctor("XYZ","Dermatologist","Dermatology",838384L);
		List<Doctor> doctorList = new ArrayList<>();
		doctorList.add(doctor1);
		doctorList.add(doctor2);
		
		String medicalTest1 = "Blood";
		String medicalTest2 = "X-ray";
		List<String> medicalTestList = new ArrayList<>();
		medicalTestList.add(medicalTest1);
		medicalTestList.add(medicalTest2);
		
		Laboratory laboratory = new Laboratory("Lal path labs", doctorList,medicalTestList);
		laboratoryDao.persist(laboratory);
		
	}
		

}
