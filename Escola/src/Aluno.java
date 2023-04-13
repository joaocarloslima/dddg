
public class Aluno {

	//atributos
	private String nome;
	private String dataDeNascimento;
	private int rm;
	private double notaCp1;
	private double notaCp2;
	private String situacao = "Reprovado";
	
	//metodos
	public void responderChamada(int tipoDeResposta){
		if (tipoDeResposta==1) System.out.println(nome + " está presente");
		if (tipoDeResposta==2) System.out.println(nome + "tá aqui");
	}
	
	public double calcularMedia() {
		return (notaCp1+ notaCp2) / 2;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
}
