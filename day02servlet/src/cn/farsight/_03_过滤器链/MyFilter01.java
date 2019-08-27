package cn.farsight._03_过滤器链;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter01 implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("--过滤器01--编码设置");
		
		resp.setContentType("text/html;charset=utf-8");
		
		fc.doFilter(arg0, resp);
		
		System.out.println("--过滤器01--编码设置--END");
		//返回响应时，过滤器从fc.dofilter()方法后执行
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
