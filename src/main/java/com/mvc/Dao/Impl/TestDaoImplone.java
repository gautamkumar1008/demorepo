/*package com.mvc.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.Dao.TestDao;
import com.mvc.Model.Test;
import com.mvc.Model.TestModel;

@Repository("TestDao")
public class TestDaoImplone implements TestDao {

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session CurrentSession(){
			
			
			boolean sess= false;
			try{
				if(sessionFactory.getCurrentSession()!=null){
					sess =true;
				}
				
			}catch(Exception e){
				
				System.out.println(e);
				return sessionFactory.openSession();
			}
			if(sess){
				return sessionFactory.getCurrentSession();
			}else{
				return sessionFactory.openSession();
			}
			
			
		}
	
	public boolean test(String username, String password) {
		
		List<TestModel> list = CurrentSession().createCriteria(Test.class).list();
		if(list.size()!=0){
			return true;
		}else		
		return false;
	}

	public List<TestModel> show() {
		List<TestModel> list = CurrentSession().createCriteria(Test.class).list();
		if(list.size()!=0){
			return list;
		}else		
		return null;
	}

}
*/