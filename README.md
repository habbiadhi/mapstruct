# Spring Boot Project Setup


Library 

- Java Faker  : To generate Data
- Mapstruct   : For domain mapping
- Swagger     : For Api Documentation

Link to Open Swagger Documentation : http://localhost:8080/v2/api-docs

### Swagger 2.0

url ui : http://localhost:8080/swagger-ui.html#/

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>

### Swagger 3.0

url ui : http://localhost:8080/swagger-ui/

    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-boot-starter</artifactId>
        <version>3.0.0</version>
    </dependency>

jika mendapatkan error  :heavy_multiplication_x:
    
    javax.servlet.ServletException: Could not resolve view with name 'forward:/swagger-ui/index.html' in servlet with name 'dispatcherServlet'

perlu tambahkan bean di swagger config file

    @Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();  
    }