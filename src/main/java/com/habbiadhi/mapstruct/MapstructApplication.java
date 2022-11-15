package com.habbiadhi.mapstruct;

import ch.qos.logback.access.servlet.TeeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean requestResponseFilter() {

		final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
		List<String> urlPattern = new ArrayList<>();
		urlPattern.add("/path");

		TeeFilter filter = new TeeFilter();
		filterRegBean.setFilter(filter);
		filterRegBean.setUrlPatterns(urlPattern);
		filterRegBean.setName("Request Response Filter");
		filterRegBean.setAsyncSupported(Boolean.TRUE);
		return filterRegBean;
	}
}
