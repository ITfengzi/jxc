package com.jxc.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jxc.demo.bean.DemoInfo;

@Repository
public interface DemoMapper {

	public DemoInfo load(@Param("id") int id);
	
}
