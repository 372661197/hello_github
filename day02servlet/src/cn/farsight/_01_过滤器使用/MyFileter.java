package cn.farsight._01_过滤器使用;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *  1. 定义一个类，implements Filter 接口
 *  2. 实现方法
 *  3. doFilter方法   为过滤器服务方法
 *  4. web.xml 中配置过滤地址
 *  5. chain.dofilter() 放行
 **/
public class MyFileter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("我是一个过滤器");
		System.out.println("我正在过滤--------------------------------------------------------------------------------------------------------------------------------");
		req.setCharacterEncoding("UTF-8");
		
		//放行网络请求
		fc.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
