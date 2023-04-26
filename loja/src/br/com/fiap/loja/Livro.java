package br.com.fiap.loja;

public class Livro extends Produto {
	
	private String autor;
	private final static String TIPO = "Livro"; //constante
	
	public Livro(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade);
		this.autor = autor;
	}
	
	@Override //sobrescrever
	public String toString() {
		return TIPO + super.toString() + " - " + autor;
	}

	@Override
	public final double precoMinimo() {
		return getPreco() * 0.8;
	}
	
	

	

}
