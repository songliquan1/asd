package com.qingaokeji.myshop.ssm190820.ajax.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingaokeji.myshop.ssm190820.pojo.Stu;
import com.qingaokeji.myshop.ssm190820.service.AppService1;

@RestController
@RequestMapping("/areainfocontrollerajax")
public class AreainfoController_Ajax {

	@Autowired
	AppService1 appService1;
	
	
	@RequestMapping("getall")
	public Object getAllAreaInfo(Integer pagenum){
		int rowcount=6;
		Integer pageCount=appService1.getPageSizeByRowCountForAreainfo(rowcount);
		List<Map>dts=appService1.getAreaInformationsWholeByPageNum(rowcount, pagenum);
		Map result=new HashMap();
		result.put("list", dts);
		result.put("pageCount",pageCount );
		return result;
	}
	
	@RequestMapping(value="doinsert")
	public String  doInsert(ModelMap mp, Stu stu){
		
		appService1.doInsert(stu);
		
		Integer pagenum=appService1.getPageSizeByRowCountForAreainfo(6);
		
		return this.getAreaInfoes(mp, pagenum);
	}
	
	@RequestMapping(value="doupdate")
	public String  doUpdate(ModelMap mp, Stu record,HttpSession session){
		
		appService1.doUpdate(record);
		
		int pagenum=((Integer) session.getAttribute("currentpagenum")).intValue();
		
		session.getAttribute("currentpagenum");
		
		return this.getAreaInfoes(mp, pagenum);
	}
	
	@RequestMapping("dodelete")
	public String doDelete(Integer sid,ModelMap mp,Integer pagenum){
		appService1.deleteStuByAID(sid);
		return this.getAreaInfoes(mp, pagenum);
	}

	@RequestMapping("getareainfoes")
	public String getAreaInfoes(ModelMap mp,Integer pagenum){
		Integer rowcount=6;
		Integer pagecount=appService1.getPageSizeByRowCountForAreainfo(rowcount);
		if(pagenum<1){
			pagenum=1;
		}
		if(pagenum>pagecount){
			pagenum=pagecount;
		}
		List<Map> dts= appService1.getAreaInformationsWholeByPageNum(rowcount, pagenum);
		mp.put("infoes",dts);  
		mp.put("pagecount",pagecount); 
		mp.put("currentpagenum",pagenum); 	
		return "/areainfo.jsp";
	}
}
