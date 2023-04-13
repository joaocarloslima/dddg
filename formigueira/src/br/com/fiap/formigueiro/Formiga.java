package br.com.fiap.formigueiro;

public class Formiga {
	
	//[modificador de acesso] [tipo] [nome] = [valor];
	private int velocidade = 5;
	private int x;
	private int y;
	private boolean estaCarregandoAlimento;
	private int feromonios;
	private int casaX;
	private int casaY;
	private int alimentoX;
	private int alimentoY;
	
	public Formiga(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void buscarAlimento() {
		andar();
		verificarSeEncontrouComida();
	}

	private void andar() {
		int sorteio = (int) (Math.random()*4);
		if(sorteio == 0) y -= velocidade;
		if(sorteio == 1) y += velocidade;
		if(sorteio == 2) x -= velocidade;
		if(sorteio == 3) x += velocidade;
		//System.out.println(x + " " + y);
	}

	private void verificarSeEncontrouComida() {
		if(x == alimentoX && y == alimentoY) {
			pegarAlimento();
		}
	}

	private void pegarAlimento() {
		estaCarregandoAlimento = true;
	}
	
	private void largarAlimento() {
		estaCarregandoAlimento = false;
	}
	
	private void verificarCasa() {
		if(estaEmCasa()) largarAlimento();
	}
	
	private boolean estaEmCasa() { //object calestenic
		return x == casaX && y == casaY;
	}
	
	public void agir() {
		if(estaCarregandoAlimento) {
			System.out.println("indo para casa");
			return;
		}
		
		buscarAlimento();
		
	}
	
	
}
