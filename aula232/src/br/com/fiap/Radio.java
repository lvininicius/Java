package br.com.fiap;

public class Radio {
	
	//atributos da classe
	public int volume;
	public float estacao;
	
	
	//metodos  de classe 
	public void aumentarVolume() {
		volume ++;
	}
	
	public void diminuirVolume() {
		volume --;
	}
	
	public void trocarEstacao(float e) {
		estacao = e;
	}
	
	public void mostrar() {
		System.out.println("Volume atual: "+ volume +"\nEstação atual: "+ estacao);
	}


}



