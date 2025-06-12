package com.agenda.agenda_contatos.initializers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan("com.agenda.agenda_contatos")
@EnableJpaRepositories("com.agenda.agenda_contatos.repository")
@EntityScan("com.agenda.agenda_contatos.model")
public class AgendaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaContatosApplication.class, args);
	}

}

