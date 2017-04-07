package br.com.fiap.exemplo.ws;

import javax.jws.WebService;

@WebService
public class HelloWeb {
	
	public String ola(String nome){
		return "Olá "+ nome;
	}

}
