package com.sppu.projectname.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sppu.projectname.app.model.AddmissionForm;

public interface AddmissionRepository extends JpaRepository<AddmissionForm, Integer> {

}
