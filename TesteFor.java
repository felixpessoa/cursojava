import java.util.Scanner;
public class TesteFor{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a quantidade de vezes que quer ter: ");
		int quantidade = scanner.nextInt();
		int j = 0;
		for (int i = 0; i < quantidade; i++){
			System.out.print(i+" ");
			System.out.println(nome);
		}
		
		while (j < 10){
			j++;
		}
	}
}