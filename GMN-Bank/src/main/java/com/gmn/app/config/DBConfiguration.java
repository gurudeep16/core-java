package com.gmn.app.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {
//this class to support JPA entity manager factory object creation
	//replacement to persistence.xml
	@Bean
	public DataSource dataSource() {
		System.out.println("calling DataSource");
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/bank");
		dmds.setUsername("root");
		dmds.setPassword("Xworkzodc@123");
		//what is connectionPool
		return dmds;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean  bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.gmn.app");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(dataSource);
		
		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("Hibernate.show_sql", true);
		jpaProperties.put("Hibernate.format_sql", true);
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
		
		bean.setJpaPropertyMap(jpaProperties);
		return bean;
		
	}
}
