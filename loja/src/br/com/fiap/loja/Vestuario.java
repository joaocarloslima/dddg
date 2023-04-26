package br.com.fiap.loja;

public class Vestuario extends Produto {

	private String cor;
	private String tamanho;
	private String tipo = "Vestuário";
	
	public Vestuario(String nome, double preco, int quantidade, String tamanho, String cor) {
		super(nome, preco, quantidade);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return tipo + super.toString()+ " - " + tamanho + " - " + cor;
	}

	
	public double precoMinimo() {
		if (estoqueEstaBaixo())
			return getPreco() * 0.7;
		
		return getPreco();
	}
	
	
	
	

}
