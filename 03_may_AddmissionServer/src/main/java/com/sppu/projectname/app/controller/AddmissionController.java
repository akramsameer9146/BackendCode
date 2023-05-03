package com.sppu.projectname.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sppu.projectname.app.model.AddmissionForm;
import com.sppu.projectname.app.service.AddmissionService;

@RestController
public class AddmissionController {
	
	@Autowired
	AddmissionService as;

	@GetMapping("/getAddmissionData")
	public List<AddmissionForm> getAddmissionData()
	{
		List<AddmissionForm> al=as.getAddmissionData();
		return al;	
	}
	
	@PostMapping("/addAddmissionData")
	public AddmissionForm adddAddmissionData(@RequestBody AddmissionForm af)
	{		
		AddmissionForm a=as.save(af);
		return a;	
	}
	
	@PutMapping("/updateAddmissionData/{id}")
	public AddmissionForm updateAddmissionData(@PathVariable int id,@RequestBody AddmissionForm af)
	{
		AddmissionForm a=as.updateAddmissionData(id,af);
		return a;
	}
	@DeleteMapping("/deleteAddmissionData/{id}")
	public String deleteAddmissionData(@PathVariable int id)
	{
		String a=as.deleteAddmissionData(id);
		return a;
	}
}
