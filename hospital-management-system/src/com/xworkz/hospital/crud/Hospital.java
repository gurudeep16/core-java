package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {

	public boolean createPatientDetails(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientAddressById(int id, String address);
	public String getPatientNameById(int id);
	public boolean deletePatientByName(String name);


}
