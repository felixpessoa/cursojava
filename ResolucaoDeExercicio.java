import java.util.Scanner;
public class ResolucaoDeExercicio {
	public static void main(String[]args){
	System.out.println("   ////////////////////////////////////////////////////////////////////////////////");	
	System.out.println("  //Faça um programa que lê o ano de nascimento e imprima na tela a sua idade.//");	
	System.out.println(" ////////////////////////////////////////////////////////////////////////////////");
	Scanner scanner = new Scanner (System.in);
	System.out.print("Em que anos voce esta: ");
	int anoAtual = scanner.nextInt();
	System.out.print("Em que anos voce nasceu : ");
	int anoDeNascimento = scanner.nextInt();
	int idade = anoAtual - anoDeNascimento;
	System.out.print("Sua idade e "+ idade + " anos");
	System.out.print("\n\n\n"); //só para pular linhas, para n ficar colado um no outro
	
	System.out.println("   ///////////////////////////////////////////////////////////////////////////////////////////");	
	System.out.println("  //  Faça um programa que leia um numero e imprima na tela o seu antecessor e sucessor.  //");	
	System.out.println(" ///////////////////////////////////////////////////////////////////////////////////////////");
	System.out.print("Digite Um Numero qualquer: ");
	int numero = scanner.nextInt();
	int incremento = numero + 1;
	int decremento = numero - 1;
	System.out.print("O numero foi "+numero+" e seu antecessor e "+decremento+", e seu sucessor e "+incremento+" .");
	System.out.print("\n\n\n");
	
	System.out.println("   ////////////////////////////////////////////////////////////////////////////");	
	System.out.println("  //  Faça um programa que leia um número qualquer e imprima o seu cubo.  //");	
	System.out.println(" ////////////////////////////////////////////////////////////////////////////");
	System.out.print("Digite um Numero para ver seu cubo: ");
	int numeroCubo = scanner.nextInt();
	int jaCubo = numeroCubo*numeroCubo*numeroCubo;
	System.out.println("O cubo de "+numeroCubo+" e "+jaCubo);
	System.out.print("\n\n\n");
	

	System.out.println("    //////////////////////////////////////////////////////////////////////////////////////");	
	System.out.println("   //  Uma empresa vai dar um aumento de salário ao seu funcionário.                 //");	
	System.out.println("  // Faça um programa para ler o salário dofuncionário e o percentual de reajuste. //");
	System.out.println(" //  Calcular e escrever o valor do novo salário.                                   //");	
	System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
	System.out.print("Qual o seu salario?");
	Float salario = scanner.nextFloat();
	int aumento1 = 10;
	int aumento2 = 8;
	if (salario <= 1700.00) {
		float aumento = (salario*aumento1)/100;
		salario = salario+aumento;
		System.out.print("Seu aumento vai ser de "+ aumento+" Totalizando "+salario+" R$.");
	} else {
		float aumento = (salario*aumento2)/100;
		salario = salario+aumento;
		System.out.print("Seu aumento vai ser de "+aumento+" Totalizando "+salario+" R$.");
	};
	
	
	}
}