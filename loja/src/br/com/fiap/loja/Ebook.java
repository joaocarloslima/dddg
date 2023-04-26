package br.com.fiap.loja;

public class Ebook extends Livro {

	public Ebook(String nome, double preco, int quantidade, String autor) {
		super(nome, preco, quantidade, autor);
	}

//	@Override
//	public double precoMinimo() {
//		return getPreco() * 0.5;
//	}

}
