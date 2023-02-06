package com.habbiadhi.mapstruct;

import ch.qos.logback.access.servlet.TeeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean requestResponseFilter() {
		final FilterRegistrationBean filterRegBean = new FilterRegistrationBean(new TeeFilter());
		filterRegBean.setName();
		return filterRegBean;
	}
}
