package org.agcs.system.web.common;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Title: BaseController.java 
* @Package org.brave.web.common 
* @Description:  基础控制器，其他控制器需集成此控制器获得initBinder自动转换的功能
* @author vivian
* @date 2016-2-19 下午4:19:52 
* @version V1.0
 */
@Controller
@RequestMapping("/baseController")
public class BaseController {
	
	/**
	 * 将前台传递过来的日期格式的字符串，自动转化为Date类型
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateConvertComm());
	}

}
