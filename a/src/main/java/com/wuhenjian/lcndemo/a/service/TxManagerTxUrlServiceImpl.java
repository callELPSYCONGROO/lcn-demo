package com.wuhenjian.lcndemo.a.service;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author SwordNoTrace
 * @date 2018/9/10 22:23
 */
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

	@Value("${tx.manager.url}")
	private String url;

	@Override
	public String getTxUrl() {
		return url;
	}
}
