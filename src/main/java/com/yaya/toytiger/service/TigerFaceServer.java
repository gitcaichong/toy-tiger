package com.yaya.toytiger.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TigerFaceServer implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---初始化---");
	}
}
