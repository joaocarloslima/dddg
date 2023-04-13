import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o numero do dia:");
		int dia = in.nextInt();
		in.close();
		
//		if(dia == 1) System.out.println("Domingo");
//		if(dia == 2) System.out.println("Segunda");
//		if(dia == 3) System.out.println("Terça");
//		if(dia == 4) System.out.println("Quarta");
//		if(dia == 5) System.out.println("Quinta");
//		if(dia == 6) System.out.println("Sexta");
//		if(dia == 7) System.out.println("Sábado");
//		
//		if (dia<1 || dia > 7) System.out.println("dia inválido");
		
		String diaDaSemana = "Domingo";
		char primeiraLetra = diaDaSemana.charAt(0);
		
		switch (dia) { //int char
		case 'D':
		case 'd':
		case '1':{
			System.out.println("Domingo");
			break;
		}
		case 'S': {
			System.out.println("Segunda");
			break;
		}
		case 3: {
			System.out.println("Terça");
			break;
		}
		default:
			System.out.println("dia inválido");
		}
			

	}
}
