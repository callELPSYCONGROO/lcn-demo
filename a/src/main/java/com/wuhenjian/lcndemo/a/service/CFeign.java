package com.wuhenjian.lcndemo.a.service;

import com.wuhenjian.lcndemo.a.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SwordNoTrace
 * @date 2018/9/6 23:02
 */
@FeignClient(value = "c", fallback = CFeignHandler.class)
public interface CFeign {

	@RequestMapping("/insertC")
	Result insertC();
}
