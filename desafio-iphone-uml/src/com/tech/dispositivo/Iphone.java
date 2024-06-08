package com.tech.dispositivo;

import com.tech.funcionalidades.AparelhoTelefonico;
import com.tech.funcionalidades.NavegadorInternet;
import com.tech.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

	//Reprodutor musical
	public void selecionarMusica(String musica) {
		System.out.println("Você selecionou a música - " + musica);
	}
	
	public void tocar() {
		System.out.println("Tocando agora!");
	}

	
	public void pausar() {
		System.out.println("Pausando reprodutor!");
	}
	
	//Navegador Internet
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página do navegador, URL: " + url);
	}

	
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba!");
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando a página!");
	}
	
	//Aparelho Telefonico
	public void ligar(String numero) {
		System.out.println("Ligando...");
	}

	
	public void atender() {
		System.out.println("Alô?!");
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz! Deixe o seu recado!");
	}


}
