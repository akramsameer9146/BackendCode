package com.sppu.projectname.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SppuController {

	@GetMapping("/getAddmissionData")
	public String getAddmissionData()
	{
		return "Addmissions Re Open At Any Time";
		
	}
}
