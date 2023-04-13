package br.com.fiap.banco;

public class App {
	
	public static void main(String[] args) {
		Conta conta = new Conta("1212");
		conta.toString();
		
		ContaPoupanca poupanca = new ContaPoupanca("23423");
		poupanca.sacar(10);
	}

}
