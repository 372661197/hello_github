package cn.farsight._01_过滤器使用;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("处理登录业务！！");
		System.out.println("获取请求头信息："+req.getParameter("user"));
		
		
		
		resp.getWriter().print("服务器过滤器链测试");
		
	}
}
