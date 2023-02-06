package com.habbiadhi.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean requestResponseFilter() {
//
//		final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
//		List<String> urlPattern = new ArrayList<>();
//		urlPattern.add("/path");
//
//		TeeFilter filter = new TeeFilter();
//		filterRegBean.setFilter(filter);
//		filterRegBean.setUrlPatterns(urlPattern);
//		filterRegBean.setName("Request Response Filter");
//		filterRegBean.setAsyncSupported(Boolean.TRUE);
//		return filterRegBean;
//	}
}
