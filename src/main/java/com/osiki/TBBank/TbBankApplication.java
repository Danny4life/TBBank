package com.osiki.TBBank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "TDD Banking Application",
				description = "Backend REST APIs for TDD Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Segun Osiki",
						email = "osiki.segun@gmail.com",
						url = "https://github.com/Danny4life/TBBank"
				),
				license = @License(
						name = "TDD Banking Application",
						url = "https://github.com/Danny4life/TBBank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Backend REST APIs for TDD Bank",
				url = "https://github.com/Danny4life/TBBank"
		)
)
public class TbBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbBankApplication.class, args);
	}

}
