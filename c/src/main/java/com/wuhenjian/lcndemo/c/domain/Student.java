package com.wuhenjian.lcndemo.c.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:43
 */
@Data
@Table(name = "student_c")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private Integer age;

	@Column
	private Date date;
}
