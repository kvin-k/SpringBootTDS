package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.TDSDao;
import com.capgemini.model.TdsMaster;

@Component("service")
@Service
@Transactional
public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao dao;
	
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

}
