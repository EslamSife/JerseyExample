package com.eslam.filter;

//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.log4j.Logger;
//
///**
//* Servlet implementation class LoggerFilter
//*/
//public class LoggerFilter implements Filter {
//
//
//	private static final Logger log = Logger.getLogger(LoggerFilter.class);
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//		CustomLoggingFilter authenticationRequestWrapper;
//		try {
//			authenticationRequestWrapper = new CustomLoggingFilter(httpServletRequest);
//		} catch (Exception ex) {
//			log.error("Unable to wrap the request", ex);
//			throw new ServletException("Unable to wrap the request", ex);
//		}
//
//
//
//		// continue the filter chain
//		chain.doFilter(authenticationRequestWrapper, response);
//
//	}
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		// TODO Auto-generated method stub
//
//	}
//
//
//
//
//}
