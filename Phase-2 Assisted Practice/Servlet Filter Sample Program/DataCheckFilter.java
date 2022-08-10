package Servlet_context_config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/DataCheckFilter")
public class DataCheckFilter implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String userid=request.getParameter("username");
		String s=request.getParameter("age");
		int age=Integer.parseInt(s);
		if("admin".equals(userid) && age==30)
		{
			response.getWriter().write("Now in the Datacheckfilter....<br>");
		chain.doFilter(request, response);
		response.getWriter().write("<br>after Datacheckfilter....<br>");
		}else
		{
			response.getWriter().write("Blocked in the Datacheckfilter...<br>");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
