package br.com.lucas.financial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FinancialTransferSystemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FinancialTransferSystemApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FinancialTransferSystemApplication.class);
	}
}
