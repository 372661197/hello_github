package cn.farsight._02_过滤器生命周期;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *  filter创建与初始化： 服务器启动时
 *  filter销毁: 服务器关闭
 *        如果配置了多个filter,从上至下依次过滤
 * @author hp
 *
 */
public class MyFilter01 implements Filter {
	public MyFilter01() {
		System.out.println("我出生了");
	}
	
	//销毁
	@Override
	public void destroy() {
		System.out.println("我死了");
		
	}
	//服务
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("我在享受生活");
		
	}
	//初始化
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("上户口了");
		
	}

}

class MyFilter02 implements Filter {
	public MyFilter02() {
		System.out.println("我出生了");
	}
	
	//销毁
	@Override
	public void destroy() {
		System.out.println("我死了");
		
	}
	//服务
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("我在享受生活");
		
	}
	//初始化
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("上户口了");
		
	}

}
