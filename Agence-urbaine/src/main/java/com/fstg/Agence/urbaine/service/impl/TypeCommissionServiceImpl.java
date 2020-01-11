package com.fstg.Agence.urbaine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.Agence.urbaine.bean.TypeCommission;
import com.fstg.Agence.urbaine.dao.TypeCommissionDao;
import com.fstg.Agence.urbaine.service.TypeCommissionService;

@Service
public class TypeCommissionServiceImpl implements TypeCommissionService {
	@Autowired
TypeCommissionDao tcd;
	@Override
	public List<TypeCommission> findAll() {
		return tcd.findAll();
	}

}
