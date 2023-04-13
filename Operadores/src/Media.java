import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// declarar variaveis
		int numero1;
		int numero2;
		
		//ler dois numeros
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		numero1 = in.nextInt();
		System.out.println("Digite o segundo numero");
		numero2 = in.nextInt();
		in.close();
		
		//calcular a media
		double media = (numero1 + numero2) / 2.0;
		
		//mostrar o resultado
		System.out.println("A media vale " + media);

	}

}
