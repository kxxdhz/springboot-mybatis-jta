package com.demo.jta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.jta.dao.test1.TestDBDao;
import com.demo.jta.dao.test2.TestDB2Dao;
import com.demo.jta.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDBDao test1;
	@Autowired
	private TestDB2Dao test2;

	@Transactional
	public void save() {
		test1.saveTest("事务测试");
		test2.saveTest("事务测试");
		throw new NullPointerException("事务测试");
	}
}
