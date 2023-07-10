package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;

//컨트롤러는 컨트롤러로 어노테이션 한다.(컨트롤러만이 하는 것이 있음)
@Controller
public class EmpController {

	@Autowired
	EmpMapper empMapper;
	
	@RequestMapping(value = "emp", method = RequestMethod.GET)
	public String empList(Model model, EmpVO empVO) {
		model.addAttribute("emp" , empMapper.getEmp(empVO));
		return "emp";
	}
}
