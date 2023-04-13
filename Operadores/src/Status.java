
public class Status {

	public static void main(String[] args) {
		int status = 0;
		String barraDeStatus = "";
		
		while(status <= 100) {
			barraDeStatus += "#";
			System.out.println(barraDeStatus);
			status += 10;
		}
		
		

	}

}
