package com.cg.healthassist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cg.healthassist.daoimpl.LaboratoryDAOImpl;
import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.model.Laboratory;


public class App 
{
    public static void main( String[] args )
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
		LaboratoryDAOImpl laboratoryDao = new LaboratoryDAOImpl();
		laboratoryDao.persist(laboratory);
    }
}
