package Servlet_context_config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Validfilter
 */
@WebFilter("/Validfilter")
public class Validfilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String userid=request.getParameter("username");
		String s=request.getParameter("age");
		int age=Integer.parseInt(s);
		try{
		if(userid!=null && age!=0)
		{
		response.getWriter().write("Now in the validation filter...<br>");
		chain.doFilter(request, response);
		response.getWriter().write("after validation filter...<br>");
		}
		else
		{
			response.getWriter().write("Blocked in the validation filter...<br>");
		}
		}
		catch(Exception e)
		{
			response.getWriter().write("Exception");
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
