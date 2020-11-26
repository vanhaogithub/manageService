package com.bachkhoa.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.bachkhoa.util.UrlUtils;

public class ErrorHandleFilter implements Filter {

	@Override
	public void destroy() {
		// ...
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		try {
			String servletPath = req.getServletPath();
			if (!UrlUtils.checkExistUrl(servletPath)) {
//				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/error");
//				dispatcher.forward(request, response);
				req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			} else{
				chain.doFilter(request, response);
			}
		} catch (Exception ex) {
			req.setAttribute("errorMessage", ex);
			req.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
		}

	}

}