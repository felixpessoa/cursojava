import java.util.Scanner;
public class PrimeiroPrograma {
	public static void main(String[]args){

	System.out.println("       //////////////////////////");
	System.out.println("      //      Ola, Mundo!     //");
	System.out.println("     //////////////////////////");

//System.out.println("A soma de 4 + 2 é 6");

System.out.print("Qual seu Nome: ");
Scanner scanner = new Scanner(System.in);
String nome = scanner.nextLine();
System.out.print("Oi "+nome+ " e qual a sua idade: ");
int idade = scanner.nextInt();
System.out.println("Certo "+nome +" voçe tem "+idade+" Anos.");

System.out.print("Digite um numero: ");
//Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();
if (numero%2== 0) {
	System.out.print("O valor "+numero+" e Par.");
}else{
	System.out.print("O valor "+numero+" e impa");
};

}
}