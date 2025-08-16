package com.udemy.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring - Hello world! aula 07 início

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);


	/*
	UsuarioService serv = new UsuarioService(new UsuarioRepository());
	UsuarioService serv2 = new UsuarioService(new UsuarioRepositoryApi());
	UsuarioService serv3 = new UsuarioService(new UsuarioRepository());
	
	
	// new UsuarioRepository()); //1:53 aula 7
	// new UsuarioRepositoryApi());
	serv.obterUsuario();
	serv2.obterUsuario();
	serv3.obterUsuario();
	 */

	}

	@Override
	public void run(String... args) throws Exception { // 9:32 aula 7
	
	}

}
