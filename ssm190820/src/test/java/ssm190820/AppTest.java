package ssm190820;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.mvc.LastModified;

import com.qingaokeji.myshop.ssm190820.pojo.Stu;
import com.qingaokeji.myshop.ssm190820.service.AppService1;


@SpringBootApplication(scanBasePackages="com.qingaokeji.myshop.ssm190820")
@MapperScan(basePackages="com.qingaokeji.myshop.ssm190820.mapper")
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
	
	@Autowired
	AppService1 appService1;
	
	@Test
	 public  void deleteByPrimaryKey(int sid) {
	        appService1.deleteStuByAID(3);
	    }
	
	
}
