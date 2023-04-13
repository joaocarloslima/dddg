
public class Jogo {

	public static void main(String[] args) {
		
		int pontos = 10;
		int level = 11;
		boolean temEspada = true;
		boolean temMagia = true;
		
		boolean gameOver;
		boolean podeAtacar;
		
		gameOver = pontos < 0;
		podeAtacar = (level>10) && (temEspada || temMagia) && !gameOver;
		
		String mensagem = podeAtacar ? "Pode atacar" : "Não pode atacar"; //ternário
		
		System.out.println("Pontos=" + pontos);
		System.out.println("Pode jogar = " + gameOver);
		System.out.println(mensagem);

	}

}
