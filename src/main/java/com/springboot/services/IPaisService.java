package com.springboot.services;

import java.util.List;

import com.springboot.models.entity.Pais;

public interface IPaisService {
	
	public List<Pais> findAll();
	
}
