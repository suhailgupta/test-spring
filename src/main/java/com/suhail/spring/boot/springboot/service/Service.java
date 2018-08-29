package com.suhail.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.suhail.spring.boot.springboot.dao.DAO;

@Component
public class Service {

	DAO dao;
	
	@Autowired
	public Service(DAO dao) {
		System.out.println("Service Bean Created");
		this.dao=dao;
	}
	
	public void save(){
		dao.create();
	}
}
