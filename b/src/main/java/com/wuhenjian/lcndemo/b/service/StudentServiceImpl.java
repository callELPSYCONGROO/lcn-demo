package com.wuhenjian.lcndemo.b.service;

import com.wuhenjian.lcndemo.b.dao.StudentDao;
import com.wuhenjian.lcndemo.b.domain.Result;
import com.wuhenjian.lcndemo.b.domain.Student;
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

	@Autowired
	private CFeign cFeign;

	@Override
	public Result insertB() {
		Student s = new Student();
		s.setName("B 学生");
		s.setAge(Math.toIntExact(System.currentTimeMillis() / 1000000));
		s.setDate(new Date());
		studentDao.save(s);
		return Result.builder().result("插入B成功").build();
	}

	@Override
	public Result insertBC() {
		Student s = new Student();
		s.setName("B 学生");
		s.setAge(Math.toIntExact(System.currentTimeMillis() / 1000000));
		s.setDate(new Date());
		studentDao.save(s);
		cFeign.insertC();
		return Result.builder().result("插入BC成功").build();
	}
}
