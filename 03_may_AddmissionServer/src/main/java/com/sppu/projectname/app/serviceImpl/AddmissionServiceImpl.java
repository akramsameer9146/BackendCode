package com.sppu.projectname.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sppu.projectname.app.model.AddmissionForm;
import com.sppu.projectname.app.repository.AddmissionRepository;
import com.sppu.projectname.app.service.AddmissionService;

@Service
public class AddmissionServiceImpl implements AddmissionService {

	@Autowired
	AddmissionRepository ar;
	@Override
	public AddmissionForm save(AddmissionForm af) {
		// TODO Auto-generated method stub
		return ar.save(af);
	}
	@Override
	public List<AddmissionForm> getAddmissionData() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}
	@Override
	public AddmissionForm updateAddmissionData(int id, AddmissionForm af) {
		// TODO Auto-generated method stub
		Optional<AddmissionForm> optional=ar.findById(id);
		
		if (optional.isPresent()) {
			
			af.setId(id);
			ar.save(af);
			
		}
		
		return af;
	}
	@Override
	public String deleteAddmissionData(int id) {
		// TODO Auto-generated method stub
		
		Optional<AddmissionForm> optional=ar.findById(id);
		if (optional.isPresent()) {
			
			ar.deleteById(id);
			
			return "Data Deleted";
		}
		else {
			
			return "Data Does not exists";
		}		
	}
}
