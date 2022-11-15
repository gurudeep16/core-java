package com.gmn.app.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringMVCDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public SpringMVCDispatcher() {
		System.out.println("Dispatch intitializer constructor");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return new Class[] {MvcConfig.class} ;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("---getServletConfigClasses---");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println();
		return new String[] {"/"};// --"/" indicates any url pattern
	}
	

}
