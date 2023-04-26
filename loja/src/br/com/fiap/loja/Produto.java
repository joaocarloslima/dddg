package br.com.fiap.loja;

public abstract class Produto { //beans - BO - POJO (plain old java object)
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String dados = String.format(" %s (%.2f): %s ", 
				nome, 
				preco, 
				quantidade
			);
		
		if (estoqueEstaBaixo()) dados = "!ESTOQUE BAIXO " + dados;
		
		return dados;
	}
	
	public abstract double precoMinimo();
	
	
	public double getPreco() {
		return preco;
	}

	public boolean estoqueEstaBaixo() {
		return quantidade < 5;
	}
	
	public static String getNomeDaLoja() {
		return "Loja do João";
	}

}
