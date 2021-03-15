package com.himani.spring_boot_example_sts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.himani.spring_boot_example_sts.dao.*;
@Component
public class Service {
	Dao dao;
	@Autowired
	public Service(Dao dao) {
		System.out.println("Service bean loaded");
		this.dao=dao;
	}
	
	public void save() {
		dao.create();
	}
}
