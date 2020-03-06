package com.qingaokeji.myshop.ssm190820.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

public interface System_AreaInfoMapper {

	public List<Map> getAreaInfoes(RowBounds rowbound);
	
	public Integer getAreaInfoesRecordCount();
	
	
}
