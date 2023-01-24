package com.xworkz.mall.configuration;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.xworkz")
public class DBConfiguration {
	
	private Logger logger = getLogger();

	public DBConfiguration() {
		logger.info(getClass().getSimpleName());
	}
	@Bean
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource source) {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setPackagesToScan("com.xworkz");
		bean.setDataSource(source);
		return bean;
	}
	@Bean
	public DataSource source() {
		HikariConfig config = new HikariConfig();
		config.setUsername("root");
		config.setPassword("Xworkzodc@123");
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/xworkz_btm");
		DataSource source = new HikariDataSource(config);
		try {
			Connection connection = source.getConnection();
			logger.config("Connection"+ connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return source;
	}

}
