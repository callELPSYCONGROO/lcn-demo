package com.wuhenjian.lcndemo.b.controller;

import com.wuhenjian.lcndemo.b.domain.Result;
import com.wuhenjian.lcndemo.b.service.StudentService;
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

	@RequestMapping("/insertB")
	public Result insertB() {
		return studentService.insertB();
	}

	@RequestMapping("/insertBC")
	public Result insertBC() {
		return studentService.insertBC();
	}
}
