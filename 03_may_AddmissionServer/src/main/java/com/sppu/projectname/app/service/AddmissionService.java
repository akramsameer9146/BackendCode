package com.sppu.projectname.app.service;

import java.util.List;

import com.sppu.projectname.app.model.AddmissionForm;

public interface AddmissionService {

	AddmissionForm save(AddmissionForm af);

	List<AddmissionForm> getAddmissionData();

	AddmissionForm updateAddmissionData(int id, AddmissionForm af);

	String deleteAddmissionData(int id);

}
