package br.com.fiap.loja;

public class Eletronico extends Produto {

	private String marca;
	private String modelo;
	private String tipo = "Eletrônico";
	
	public Eletronico(String nome, double preco, int quantidade, String marca, String modelo) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return tipo + super.toString() + " - " + marca + " - " + modelo;
	}

	
	public double precoMinimo() {
		if (marca.equalsIgnoreCase("Apple")) 
			return getPreco();
		
		return getPreco() * 0.9;
	}
	
	
	

}
