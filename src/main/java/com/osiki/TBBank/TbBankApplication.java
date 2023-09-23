package com.osiki.TBBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
public class TbBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbBankApplication.class, args);

		System.out.println(Year.now());
	}

}
