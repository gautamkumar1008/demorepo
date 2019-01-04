package com.mvc.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.Model.Test;
import com.mvc.Service.TestService;

@Controller
@SessionAttributes({"t1", "t2"})
@Scope("session")
public class TestController {
	
	@Autowired
	TestService testservice;
	
	Session session;
	
	@RequestMapping("test{t1}{t2}")
	ModelAndView test(@RequestParam("t1") String t1, @RequestParam("t2") String t2){
		ModelAndView mv = new ModelAndView();
		boolean test =  testservice.test(t1, t2);
		if(test){
			mv.addObject("t1", t1);
			mv.addObject("t2", t2);
			mv.setViewName("login");
		}else{
			mv.addObject("error", "Invalid Username Or Password");
			mv.setViewName("dashboard");
		}
		return mv;
		
	}
	@RequestMapping("show")
	ModelAndView show(){
		
		ModelAndView mv = new ModelAndView();
		List<Test> list = testservice.show();
		if(list.size()!=0){
			mv.addObject("list", list);
			mv.setViewName("login");
		}else{
			mv.setViewName("error");
		}
			return mv;
	}
	@RequestMapping("login")
	ModelAndView demo(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dashboard");
		return mv;
	}
	
	@RequestMapping("getvalue{id}")
	ModelAndView getValue(@RequestParam("id") String id){
		ModelAndView mv = new ModelAndView();
		List<Test> list = testservice.getValue(id);
		if(list.size()!=0 && list !=null){
			mv.addObject("list", list);
			mv.setViewName("error");
		}else{
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("logout")
	ModelAndView logout(SessionStatus status, WebRequest request){
		status.setComplete();
		request.removeAttribute("t1", WebRequest.SCOPE_SESSION);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

}
