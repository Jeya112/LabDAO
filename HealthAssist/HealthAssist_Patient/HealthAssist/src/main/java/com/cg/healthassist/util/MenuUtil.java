package com.cg.healthassist.util;
import java.util.Scanner;

import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.model.Hospital;
import com.cg.healthassist.model.Laboratory;
import com.cg.healthassist.model.MedicalStore;
import com.cg.healthassist.model.Patient;

public class MenuUtil {
	       public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------Health Assist Application-----------");
			System.out.println("-----------Patient Services-----------");
			System.out.println("Choose 1 for Search ");
			System.out.println("Choose 2 for View");
			System.out.println("Choose 3 for Book");
			System.out.println("Choose 4 for Find");
			System.out.println("Choose 5 for Order");
			System.out.println("Choose 6 for Upload");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
		
			if(choice==1) {
			
				System.out.println("1.Medical Store");
				System.out.println("2.Hospital");
				System.out.println("3.Doctor");
				System.out.println("4.Laboratory");
				System.out.println("Enter the choice");
				int option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Search for Medical Store on basis of medicine");
                                        break;
				case 2:
					System.out.println("Search for Hospital on basis of speciality or bed avaolability or doctor availability");
					break;
				case 3:
					System.out.println("Search for Doctor on basis of speciality");
					break;
				case 4:
			                System.out.println("Search for Laboratory on basis of MedicalTest name ");
                                        break;
				}
			}
				else if(choice==2)
				{
					System.out.println("1.Medical History");
					System.out.println("2.Order History");
					System.out.println("3.Medical Test Hitory");
					System.out.println("Enter the choice");
					int option= sc.nextInt();
					switch(option) {
					case 1:
						System.out.println("View Medical History of patient");
						break;
					case 2:
						System.out.println("View Order History of medicine");
						break;
					case 3:
						System.out.println("View MedicalTest History of patient");
						break;
					}
					}
				else if(choice==3)
				{
					System.out.println("1.Doctor Appointment");
					System.out.println("2.Bed");
					System.out.println("3.Medical Test Appointment");
					System.out.println("Enter your choice");
					int option=sc.nextInt();
					switch(option){
					case 1:
						System.out.println("Book Doctor Appointment");
						break;
					case 2:
						System.out.println("Book Bed in the hospital");
						break;
					case 3:
					        System.out.println("Book Medical Test Appointment");
						break;
					}
				}
				else if(choice==4)
				{
					System.out.println("Find package for Treatment");
					
				}
				else if(choice==5)
				{
					System.out.println("Order medicines in the Medical Store");
				}
				else if(choice==6)
				{
					System.out.println("Upload Prescription Copy");
				}
				else
				{
					System.out.println("Invalid choice");
				}
                                sc.close();
			}
			
			

	}

