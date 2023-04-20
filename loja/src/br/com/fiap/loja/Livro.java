package br.com.fiap.loja;

public class Livro extends Produto {
	
	private String autor;
	
	public Livro(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor = autor;
	}
	
	@Override //sobrescrever
	public String toString() {
		return super.toString() + " - " + autor;
	}

	@Override
	public double precoMinimo() {
		return super.precoMinimo() * 0.8;
	}
	
	

	

}
