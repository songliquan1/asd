package com.qingaokeji.myshop.ssm190820.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.qingaokeji.myshop.ssm190820.mapper.StuMapper;
import com.qingaokeji.myshop.ssm190820.mapper.System_AreaInfoMapper;
import com.qingaokeji.myshop.ssm190820.pojo.Stu;
import com.qingaokeji.myshop.ssm190820.pojo.StuExample;

@Service
public class AppService1 {

	@Autowired
	StuMapper stuMapper;
	
	
	@Autowired
	System_AreaInfoMapper system_AreaInfoMapper;
	
	
	/**
	 * 添加信息的方法
	 * @return
	 */
	public boolean doInsert(Stu stu) {
		
		return stuMapper.insert(stu)==1;
		
	}
	
	/**
	 * 信息更新的方法
	 * @return
	 */
	public boolean doUpdate(Stu record){
		
		return stuMapper.updateByPrimaryKey(record)==1;
	}
	
	/**
	 * 根据指定编号删除人员信息
	 * @param sid
	 * @return
	 */
	public boolean  deleteStuByAID(Integer sid){
		
		return stuMapper.deleteByPrimaryKey(sid)==1;
	}
	

	/**
	 * 获取完整的信息
	 * @return
	 */
	public List<Map> getAreaInformationsWholeByPageNum(Integer rowcount,Integer pagenum){
		int offset=(pagenum-1)*rowcount;
		RowBounds bound=new RowBounds(offset, rowcount);
		
		return system_AreaInfoMapper.getAreaInfoes(bound);
	}
	/**
	 * 根据每页行数 获取 总页数
	 * @param rowcount 每页行数
	 * @return
	 */
	public Integer getPageSizeByRowCountForAreainfo(Integer rowcount){
		
		Integer count=system_AreaInfoMapper.getAreaInfoesRecordCount();
		
		return (count%rowcount==0) ? (count/rowcount)  :  (count/rowcount)+1;
	}
	
	
	
	

	/**
	 * 获取全部人员名单
	 * @return
	 */
	public List<Stu> getAllAreaInformations(){
		
		StuExample example=new StuExample();
		return stuMapper.selectByExample(example);
		
	}
	

	
	
	
	
	
}
