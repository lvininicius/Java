package br.com.fiap;

public class TV {
	
	public int vol;
	public int canal;
	
	public void aumentarVol() {
		vol ++;
	}
	
	public void diminuirVol() {
		vol--;
	}
	
	public void trocarCanal(int e) {
		canal = e;
	}
	
}
