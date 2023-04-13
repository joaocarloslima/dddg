import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		int numero = -1;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número negativo para parar");
		
		while(numero >= 0 ) {
			System.out.print("Digite um numero");
			numero = in.nextInt();
			boolean ehPar = numero % 2 == 0;
			System.out.println(ehPar?"É par":"Não é par" );			
		}
		
		System.out.println("Tchau, brigado");
		
		in.close();
		
//		if (numero < 0) {
//			System.out.println("É negativo");
//			return; //early return
//		}
//		
//		if (numero > 10) {
//			System.out.println("É muito grande");
//			return; //early return
//		}
//		
		
//		System.out.println("É válido");
		
	}

}
