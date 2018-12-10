package com.mvc.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mvc.Model.TestModel;

public class TestMapper implements RowMapper<TestModel>{

	public TestModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		TestModel testmodel = new TestModel();
		
		testmodel.setId(rs.getInt("id"));
		testmodel.setName(rs.getString("name"));
		return testmodel;
	}

}
