package com.example.esercizio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.esercizio.cli.CliManager;
import com.example.esercizio.db.service.UtenteService; 

@SpringBootApplication
public class EsercizioApplication implements CommandLineRunner{

	@Autowired
	private UtenteService utenteService;

	public static void main(String[] args) {
		SpringApplication.run(EsercizioApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		new CliManager(utenteService);
	}
}
