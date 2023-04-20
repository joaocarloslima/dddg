package br.com.fiap.loja;

public class App {
	
	public static void main(String[] args) {
		Produto p = new Produto("Pro", 10, 1);
		Produto livro = new Livro("DDD", 100, 1, "Martin Flowler");
		Eletronico eletronico = new Eletronico("iPhone", 4_000_000.99, 3, "Apple", "14Pro");
		Vestuario vestuario = new Vestuario("Blusinha", 60.0, 41, "P", "branco");
		
		System.out.println(livro);
		System.out.println(eletronico);
		System.out.println(vestuario);
		
		System.out.println(livro.precoMinimo());
		System.out.println(eletronico.precoMinimo());
		
	}
}
