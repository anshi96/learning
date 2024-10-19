package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class empServiceImpl implements empService {
	
	@Autowired
	private employdao emdao;

	@Override
	public List<employ> allemploy() {
		
		List<employ> emplist = emdao.findAll();
	
		
		return emplist;
	}

}
