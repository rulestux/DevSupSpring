package com.tuxmarrento.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tuxmarrento.project.entities.User;
import com.tuxmarrento.project.repositories.UserRepository;

// 'annotation' para indicar a natureza da classe como configuração:
@Configuration
// indicando o perfil, conforme definido em 'application.properties':
@Profile("test")
// implementando a interface 'CommandLineRunner' para executar
// os recursos da classe através do respectivo método 'run':
public class TestConfig implements CommandLineRunner {

	/* '@autowired' para indicar ao Spring que deve-se injetar
	 * a dependência e associar uma instância de 'UserRepository'
	 * à classe 'TestConfig': */	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// instanciando usuários para popular o Banco de Dados:
		User u1 = new User(null, "Maria Brown", "988888888", "maria@gmail.com", "123456");
		User u2 = new User(null, "Alex Green", "977777777", "alex@gmail.com", "123456");

		// salvando as instâncias no Banco de Dados 
		// (DATABASE SEEDING) com o método 'saveAll(LIST)':
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
