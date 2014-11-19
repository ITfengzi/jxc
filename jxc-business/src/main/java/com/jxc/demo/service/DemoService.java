package com.jxc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxc.demo.bean.DemoInfo;
import com.jxc.demo.mapper.DemoMapper;

@Service
public class DemoService {

	@Autowired
	private DemoMapper mapper;
	
	public DemoInfo get(int id) {
		return mapper.load(id);
	}
}
