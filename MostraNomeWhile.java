import java.util.Scanner;

public class MostraNomeWhile{
	public static void main (String[] args){
		int i = 0;
		Scanner scanner = new Scanner(System.in);
					System.out.println("Digite nome:");
						String nome = scanner.nextLine();
						
		while(i < 11){
			System.out.print(i+ " ");
			System.out.println(nome);
			
			i++;
			
		}
	}
}