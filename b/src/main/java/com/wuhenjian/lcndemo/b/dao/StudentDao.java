package com.wuhenjian.lcndemo.b.dao;

import com.wuhenjian.lcndemo.b.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:43
 */
@Mapper
@Repository
public interface StudentDao {

	int insert(Student student);
}
