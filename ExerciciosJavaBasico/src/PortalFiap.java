import java.util.Scanner;

public class PortalFiap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = in.nextLine();
		double nota = 0;
		double soma = 0;
		double qtde = -1;
		
		while(nota >= 0) {
			soma += nota;
			qtde++;
			System.out.print("Digite uma nota: ");
			nota = in.nextDouble();
		}
		
		double media = soma / qtde;
		System.out.println("Media = " + media);
		in.close();
	}

}
