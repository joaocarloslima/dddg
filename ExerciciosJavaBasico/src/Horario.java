import java.util.Scanner;

public class Horario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char dia;
		
		System.out.println("Escolha a opção: "
				+ "\n a-segunda"
				+ "\n b-terça"
				+ "\n c-quarta");
		
		dia = in.next().charAt(0);
		
		if(dia == 'a') {
			System.out.println("Aula da segunda");
			return;
		}
		if(dia == 'b') {
			System.out.println("Aula da terca");
			return;
		}
		System.out.println("Opção inválida");
		
		switch (dia) {
		case 'a' : 
		case 'A' : 
		{
			System.out.println("Aula da segunda");
			break;
		}
		case 'b' : {
			System.out.println("Aula da terca");
			break;
		}	
		case 'c' : {
			System.out.println("Aula da quarta");
			break;
		}	
		default:
			System.out.println("Opção inválida");
		}
		in.close();
	}
}
