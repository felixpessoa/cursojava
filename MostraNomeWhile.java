import java.util.Scanner;

public class MostraNomeWhile{
	public static void main (String[] args){
		int i = 0;
		Scanner scanner = new Scanner(System.in);
					System.out.println("Digite nome:");
						String nome = scanner.nextLine();
					System.out.println("Digite Quantas vezes quer  ver seu nome: ");
						int quantidade = scanner.nextInt();
						
		while(i < quantidade){
			System.out.print(i+ " ");
			System.out.println(nome);
			
			i++;
			
		}
	}
}