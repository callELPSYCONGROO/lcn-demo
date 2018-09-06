package com.wuhenjian.lcndemo.b.service;

import org.springframework.stereotype.Component;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 23:02
 */
@Component
public class CFeignHandler implements CFeign {
	@Override
	public Object insertC() {
		throw new RuntimeException("C远程调用发生错误");
	}
}
