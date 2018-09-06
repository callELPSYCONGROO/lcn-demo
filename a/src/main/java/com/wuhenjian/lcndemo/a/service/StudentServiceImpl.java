package com.wuhenjian.lcndemo.a.service;

import com.wuhenjian.lcndemo.a.dao.StudentDao;
import com.wuhenjian.lcndemo.a.domain.Result;
import com.wuhenjian.lcndemo.a.domain.Student;
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
	private BFeign bFeign;

	@Autowired
	private CFeign cFeign;

	@Override
	public Result insert() {
		insertA();
		bFeign.insertBC();
		return Result.builder().result("插入ABC成功").build();
	}

	@Override
	public Result insertTwo() {
		insertA();
		bFeign.insertB();
		cFeign.insertC();
		return Result.builder().result("插入ABC成功").build();
	}

	@Override
	public Result insertA() {
		Student s = new Student();
		s.setName("A 学生");
		s.setAge(Math.toIntExact(System.currentTimeMillis() / 1000000));
		s.setDate(new Date());
		studentDao.save(s);
		return Result.builder().result("插入A成功").build();
	}
}
