package com.wuhenjian.lcndemo.a.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 22:43
 */
@Data
public class Student {

	private Long id;

	private String name;

	private Integer age;

	private Date date;
}
