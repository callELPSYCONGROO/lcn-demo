package com.wuhenjian.lcndemo.c.service;

import com.wuhenjian.lcndemo.c.dao.StudentDao;
import com.wuhenjian.lcndemo.c.domain.Result;
import com.wuhenjian.lcndemo.c.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:49
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Result insert() {
		Student s = new Student();
		s.setName("C 学生");
		s.setAge(Math.toIntExact(System.currentTimeMillis() / 1000000));
		s.setDate(new Date());
		return Result.builder().result("插入C成功").build();
	}
}
