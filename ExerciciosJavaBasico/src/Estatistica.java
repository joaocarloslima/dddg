import java.util.Scanner;

public class Estatistica {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resposta = 0;
		int totalDeAprovados = 0;
		int totalDeReprovados = 0;
		double percentualAprovados;
		double percentualReprovados;
		double total;
		
		while(resposta != 3 ) {
			System.out.println("Escolha a opção: \n 1-aprovado \n 2-reprovado \n 3-sair");
			resposta = in.nextInt();
			if (resposta == 1) totalDeAprovados++;
			if (resposta == 2) totalDeReprovados++;
			if (resposta < 0 || resposta > 3) System.err.println("resposta inválida");
		}
		
		total = totalDeAprovados + totalDeReprovados;
		percentualAprovados = totalDeAprovados / total * 100;
		percentualReprovados = totalDeReprovados / total * 100;
		
		System.out.println(String.format("Aprovados = %s (%s perc.)", totalDeAprovados, percentualAprovados));
		System.out.println(String.format("Reprovados = %s (%s perc.)", totalDeReprovados, percentualReprovados));
		
		in.close();
	}
}
