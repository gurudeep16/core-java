package com.gmn.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.gmn.app")
public class MvcConfig {

	public MvcConfig() {
		System.out.println("MvcConfig constructor");
	}
	 @Bean
	   public ViewResolver setupViewResolver() {
		System.out.println("set up view resolver");
		   return new InternalResourceViewResolver("/" , ".jsp");
		   
	   }
}
