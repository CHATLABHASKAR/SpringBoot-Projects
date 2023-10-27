package com.jsp.springboot_hospitalmanagenentsystem.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class ApplicationConfig {

	@Bean
	public Docket getDocket() {
		
		Contact contact=new Contact("infosys", "www.info.com", "info@abc.in");
		
		List<VendorExtension> list=new ArrayList<>();
		
		ApiInfo apiInfo=new ApiInfo("Hospital management system", "hospital managing app", "version 1.0",
				"1 yr of free service", contact, "www.infolicense.com", "infolicense@gmail.com",list);
		
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.jsp.springboot_hospitalmanagenentsystem"))
				.build().apiInfo(apiInfo).useDefaultResponseMessages(false);
	}
}
