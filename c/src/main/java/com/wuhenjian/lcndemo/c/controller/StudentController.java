package com.wuhenjian.lcndemo.c.controller;

import com.wuhenjian.lcndemo.c.domain.Result;
import com.wuhenjian.lcndemo.c.service.StudentService;
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

	@RequestMapping("/insertC")
	public Result insertC() {
		return studentService.insert();
	}
}
