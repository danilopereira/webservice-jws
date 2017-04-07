package br.com.fiap.exemplo.ws.consumidor;

import br.com.fiap.exemplo.ws.client.HelloWeb;
import br.com.fiap.exemplo.ws.client.HelloWebService;

public class Consumidora {
	
	public static void main(String[] args) {
		HelloWeb port = new HelloWebService().getHelloWebPort();
		System.out.println(port.ola("Danilo Pereira"));
	}

}
