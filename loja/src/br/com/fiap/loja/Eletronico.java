package br.com.fiap.loja;

public class Eletronico extends Produto {

	private String marca;
	private String modelo;
	
	public Eletronico(String nome, double preco, int quantidade, String marca, String modelo) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + marca + " - " + modelo;
	}

	@Override
	public double precoMinimo() {
		if (marca.equalsIgnoreCase("Apple")) 
			return super.precoMinimo();
		
		return super.precoMinimo() * 0.9;
	}
	
	
	

}
