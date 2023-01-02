package com.xworkz.mall.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private Class[] classes = { SpringConfiguration.class, DBConfiguration.class };
	private String[] mappings = { "/" };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return mappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
