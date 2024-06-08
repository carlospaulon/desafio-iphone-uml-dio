package com.tech.user;
import com.tech.dispositivo.Iphone;

public class Usuario {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.selecionarMusica("Castle on the hill");
		iphone.pausar();
		iphone.tocar();
		System.out.println();
		
		iphone.ligar("+99 99 99999-9999");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println();

		iphone.exibirPagina("www.teste.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
