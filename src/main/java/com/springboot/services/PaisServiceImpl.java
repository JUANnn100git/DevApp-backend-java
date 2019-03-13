package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.models.dao.IPaisDao;
import com.springboot.models.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService {
	
	@Autowired
	private IPaisDao paisDao;

	@Override
	@Transactional(readOnly = true)
	public List<Pais> findAll() {
		return paisDao.findAll();
	}

}
