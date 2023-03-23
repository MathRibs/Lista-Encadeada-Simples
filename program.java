package app;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		list List = new list();
		
		int op;
		do {
			
			showMenu();
			op= leitor.nextInt();
			
			switch (op) {
			case 1: {
				System.out.print("Digite um numero: ");
				double value = leitor.nextDouble();
				List.add(value);
				break;
			}case 2: {
				System.out.println(List.toString());
				break;
			}case 3: {
				 System.out.println("Fim Do Programa!");
				break;
			}
			default:
			System.out.println ("Opção Invalida: ");
			}
			
			
			
		}while(op !=3);





		leitor.close();
	}

	public static void showMenu() {
		System.out.println("1 - Inserir elemento na Lista");
		System.out.println("2 - Mostrar Lista");
		System.out.println("3 - Sair");

	}

}

