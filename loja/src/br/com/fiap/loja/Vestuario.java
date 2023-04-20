package br.com.fiap.loja;

public class Vestuario extends Produto {

	private String cor;
	private String tamanho;
	
	public Vestuario(String nome, double preco, int quantidade, String tamanho, String cor) {
		super(nome, preco, quantidade);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return super.toString()+ " - " + tamanho + " - " + cor;
	}

	@Override
	public double precoMinimo() {
		if (estoqueEstaBaixo())
			return super.precoMinimo() * 0.7;
		
		return super.precoMinimo();
	}
	
	
	
	

}
