package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capgemini.model.TdsMaster;

@Component("dao")
@Repository
@ComponentScan("com")
public class TDSDaoImpl implements TDSDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public TdsMaster getById(int id) {
		TdsMaster tdsMaster = entityManager.find(TdsMaster.class, id);
		return tdsMaster;
	}

}
