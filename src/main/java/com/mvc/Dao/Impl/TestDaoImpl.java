package com.mvc.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.Dao.TestDao;
import com.mvc.Model.Test;
import com.mvc.Model.TestModel;

@Repository("TestDao")
public class TestDaoImpl implements TestDao {

	@Autowired
	SessionFactory sessionfactory;
	
	TestModel testmodel = new TestModel();
	
	protected Session CurrentSession() {
		boolean sess = false;
		
		try {
			if (sessionfactory.getCurrentSession() != null) {
				sess = true;
			}
		} catch (Exception e) {
			System.out.println(e);
			return sessionfactory.openSession();
		}
		if (sess) {
			return sessionfactory.getCurrentSession();
		} else {
			return sessionfactory.openSession();
		}
	}

	public boolean test(String username, String password) {
		List<Test> list = null;
		String uname = username;
		String pass = password;
		try{
			String hql = "from Test t where t.name = '" + uname + "' AND t.id= '" +pass+"'";
			//String hql = "from Test t where t.name='Akash' AND t.id=01";
			list = CurrentSession().createQuery(hql).list();
			
		}catch(Exception e){
			System.out.println(e);
		}
		if(list!=null && list.size()!=0){
			for(int i=0; i<list.size(); ++i){
				System.out.println(list.get(i));
				testmodel.getId();
				System.out.println("ID:" +list.get(i).getId() +"Name:" +list.get(i).getName());
				
			}return true;
		}else{
			return false;
		}
	}

	public List<Test> show() {
		
		String sql = "from Test";
		List<Test> list = CurrentSession().createQuery(sql).list();
		if(list.size()!=0){
			return list;
		}
		
		return null;
	}

	public List<Test> getValue(String id) {
		String sql = "from Test t where t.id= '"+id+"' ";
		List<Test> list = CurrentSession().createQuery(sql).list();
		if(list.size()!=0){
			return list;
		}
		return null;
	}

}
