package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.models.entity.Pais;
import com.springboot.services.IPaisService;


@CrossOrigin(origins = {"https://devapp-frontend-angular-cloud.firebaseapp.com", "http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PaisRestController {
	
	@Autowired
	private IPaisService paisService;
	
	@GetMapping("/paises")
	public List<Pais> listarTodos(){
		return paisService.findAll();
	}
	
}