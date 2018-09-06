package com.wuhenjian.lcndemo.a.controller;

import com.wuhenjian.lcndemo.a.domain.Result;
import com.wuhenjian.lcndemo.a.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:41
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/insertA")
	public Result insertA() {
		return studentService.insertA();
	}

	@RequestMapping("/onebyone")
	public Result onebyone() {
		return studentService.insert();
	}

	@RequestMapping("/onebytwo")
	public Result onebytwo() {
		return studentService.insertTwo();
	}
}
