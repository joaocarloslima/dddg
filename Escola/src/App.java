
public class App {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		joao.setNome("João Carlos");
//		joao.notaCp1 = -5;
//		joao.notaCp2 = 2;
		joao.responderChamada(2);
		double mediaJoao = joao.calcularMedia();
		System.out.println("Media do joao " + mediaJoao);
		System.out.println(joao.getSituacao());
		
		
		Aluno maria = new Aluno();
		//maria.nome = "Maria Silva";
//		maria.notaCp1 = 10;
//		maria.notaCp2 = 9;
		maria.responderChamada(1);
		maria.calcularMedia();
		
	}

}
