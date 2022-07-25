package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of patients to be added");
		int size = sc.nextInt();
		Hospital ht = new HospitalImpl(size);

		for (int i = 0; i < size; i++) {

			System.out.print("enter id :");
			int id = sc.nextInt();

			System.out.print("enter name :");
			String name = sc.next();

			System.out.print("enter address :");
			String address = sc.next();

			System.out.print("enter gender");
			String gender  = sc.next();

			PatientDTO dto = new PatientDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setAddress(address);
			dto.setGender(Gender.valueOf(gender));
			ht.createPatientDetails(dto);

		}
		String option = null;
		do {
			System.out.println("Enter 1 to fetch patient details");
			System.out.println("Enter 2 to update patient address by id");
			System.out.println("Enter 3 to get patient details by id ");
			System.out.println("Enter 4 to delete patient details by name");

			System.out.println("enter the choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				ht.getPatientDetails();
				break;

			case 2:
				System.out.println("enter existing id");
				int existingId = sc.nextInt();
				System.out.println("enter new address");
				String updatedAddress = sc.next();
				ht.updatePatientAddressById(existingId, updatedAddress);
				break;

			case 3:
				System.out.println("enter patient id");
				int id = sc.nextInt();
				ht.getPatientNameById(id);
				break;

			case 4:
				System.out.println("enter existing name");
				String name1 = sc.next();
				ht.deletePatientByName(name1);
				break;

			default:
				System.out.println("Enter the proper number");
				break;

			}
			System.out.println("Do you want to continue Y/N");
			option = sc.next();

		} while (option.equals("Y"));

		sc.close();
	}

}
