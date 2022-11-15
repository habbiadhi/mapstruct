package com.habbiadhi.mapstruct;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Bean
	public HttpTraceRepository httpTraceRepository() {
		return new InMemoryHttpTraceRepository() {
			ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
			Logger logger = LoggerFactory.getLogger(InMemoryHttpTraceRepository.class);

			@Override
			public void add(HttpTrace trace) {
				try {
					logger.warn(objectMapper.writeValueAsString(trace));
				} catch (JsonProcessingException e) {
					logger.error(e.getMessage(), e);
				}
				super.add(trace);
			}
		};
	}

}
