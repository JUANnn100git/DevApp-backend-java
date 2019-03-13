package com.springboot.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.models.entity.Pais;

public interface IPaisDao extends JpaRepository<Pais, Long>{

}

