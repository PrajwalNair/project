package com.xworkz.mall.configuration;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static com.xworkz.mall.logger.Loggers.*;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	
	private Logger logger = getLogger();

	public SpringConfiguration() {
		logger.info(getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		logger.info("Running viewResolver");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}

}
