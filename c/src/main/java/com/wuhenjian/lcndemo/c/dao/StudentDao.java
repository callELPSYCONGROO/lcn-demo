package com.wuhenjian.lcndemo.c.dao;

import com.wuhenjian.lcndemo.c.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:43
 */
public interface StudentDao extends CrudRepository<Student, Long> {
}
