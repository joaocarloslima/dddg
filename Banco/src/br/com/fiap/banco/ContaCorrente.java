package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(String numero) {
		super(numero);
	}

	private double tarifa;

	public double getTarifa() {
		return tarifa;
	}
	
}
