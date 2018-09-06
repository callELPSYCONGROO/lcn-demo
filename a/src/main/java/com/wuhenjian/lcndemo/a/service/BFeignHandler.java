package com.wuhenjian.lcndemo.a.service;

import com.wuhenjian.lcndemo.a.domain.Result;
import org.springframework.stereotype.Component;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 23:02
 */
@Component
public class BFeignHandler implements BFeign {
	@Override
	public Result insertB() {
		throw new RuntimeException("B远程调用发生错误");
	}
	@Override
	public Result insertBC() {
		throw new RuntimeException("B远程调用发生错误");
	}
}
