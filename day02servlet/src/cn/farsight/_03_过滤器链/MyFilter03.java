package cn.farsight._03_过滤器链;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter03 implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("--过滤器03--");
		fc.doFilter(arg0, arg1);
		
		System.out.println("--过滤器03--END");
		
	}
	/**
	 * 初始化在tomcat启动时运行
	 * 
	 * fc.getFilterName() 拿到过滤器配置名
	 * fc.getInitParameterNames()  拿到所有初始化参数名 并返回Enumeration<String> 集合
	 * fc.getInitParameter("参数名")   通过参数名获取参数值
	 *	names.nextElement() 拿到当前 参数名 ，光标并向下移动一位
	 */
	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println(fc.getFilterName());
		Enumeration<String> names = fc.getInitParameterNames();
		/**
		 * names.nextElement();直接返回第一个name ,并向下移动一位
		 */
		while (names.hasMoreElements()) {
			System.out.println(fc.getInitParameter(names.nextElement()));
			
		}
		
		
		
		
		
		
	}

}
