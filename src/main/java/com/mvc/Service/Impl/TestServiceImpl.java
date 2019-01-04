package com.mvc.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Dao.TestDao;
import com.mvc.Model.Test;
import com.mvc.Service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestDao testdao;
	
	public boolean test(String username, String password) {
		
		return testdao.test(username, password);
		
	}

	public List<Test> show() {
		
		return testdao.show();
	}

	public List<Test> getValue(String id) {
		return testdao.getValue(id);
	}

}
