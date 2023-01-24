package com.xworkz.mall.configuration;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private Class[] classes = { SpringConfiguration.class, DBConfiguration.class };
	private String[] mappings = { "/" };
	private Logger logger = getLogger();
	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.config("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.config("getServletConfigClasses");
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		logger.config("getServletMappings");
		return mappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
