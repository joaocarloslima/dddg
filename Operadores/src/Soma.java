import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		
		//declarar variáveis ✅
		int numero1;
		int numero2;
		int soma;
		
		//ler os valores ✅
		numero1 = Integer.valueOf( JOptionPane.showInputDialog("Digite o primeiro número") );
		numero2 = Integer.valueOf( JOptionPane.showInputDialog("Digite o segundo número") );
		
		//calcular a soma ✅
		soma = numero1 + numero2;
		
		//mostrar o resultado ✅
		JOptionPane.showMessageDialog(null, "A soma vale " + soma);
		

	}

}
