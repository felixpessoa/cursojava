import java.util.Scanner;
public class Calendario{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Digite um Numero de 1 a 12: ");
			int a = scanner.nextInt();
	switch (a){
		case 1:
		System.out.println(a+" é Janeiro.");
	break;
	case 2:
		System.out.println(a+" é Fevereiro");
	break;
	case 3:
		System.out.println(a+" é Março");
	break;
	case 4:
		System.out.println(a+" é Abril");
	break;
	case 5:
		System.out.println(a+" é Maio");
	break;
	case 6:
		System.out.println(a+" é Junho");
	break;
	case 7:
		System.out.println(a+" é Julho");
	break;
	case 8:
		System.out.println(a+" é Agosto");
	break;
	case 9:
		System.out.println(a+" é Setembro");
	break;
	case 10:
		System.out.println(a+" é Outubro");
	break;
	case 11:
		System.out.println(a+" é Novembro");
	break;
	case 12:
		System.out.println(a+" é Dezembro");
	break;
	default:
		System.out.println("Neum dos valos corresponde aos dias do mês");
		break;
	
	
	}
	}

}