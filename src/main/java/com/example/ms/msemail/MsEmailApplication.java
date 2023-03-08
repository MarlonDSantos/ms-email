package com.example.ms.msemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmailApplication.class, args);
	}

}
//Mensagem assicrona = ex. um email, não necessita de respostas
// sicrona = ex. messagem de zap. nencessita de respostas
//https://www.cloudamqp.com/