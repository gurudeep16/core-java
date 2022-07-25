package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {
	PatientDTO[] dtos;
	int index;

	public HospitalImpl(int size) {
		dtos = new PatientDTO[size];
	}

	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("inside create patient");
		boolean isAdded = false;
		if (dto != null) {
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("details added successfully");
		} else {
			System.out.println("not added");
		}

		return isAdded;

	}

	public void getPatientDetails() {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);
		}

	}

	public boolean updatePatientAddressById(int id, String address) {
		System.out.println("inside update patient");
		boolean updateAddress = false;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				dtos[i].setAddress(address);
				;
				updateAddress = true;
				System.out.println("updated");
			} else {
				System.out.println("not updated");

			}

		}
		return updateAddress;

	}

	public String getPatientNameById(int id) {
		String names = null;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				names = dtos[i].getName();
				System.out.println(dtos[i].getName());

			} else {
				System.out.println("not found");

			}
		}
		return names;

	}

	public boolean deletePatientByName(String name) {
		boolean deletePatient = false;
		int i, j;
		for (i = 0, j = 0; i < dtos.length; i++) {
			if (!dtos[j].getName().equals(name)) {
				dtos[i++] = dtos[j];
				deletePatient = true;

			} else {
				System.out.println("not deleted");

			}
		}
		dtos = Arrays.copyOf(dtos, j);
		return deletePatient;
	}
}
