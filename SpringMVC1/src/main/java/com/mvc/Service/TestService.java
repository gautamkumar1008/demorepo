package com.mvc.Service;

import java.util.List;

import com.mvc.Model.Test;

public interface TestService {

	public boolean test(String username, String password);
	public List<Test> show();
	public List<Test> getValue(String id);
}
