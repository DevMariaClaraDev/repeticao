package repetição;

import java.util.Scanner;

public class Numero26 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		float valor;

		System.out.print("Digite o valor do pão: ");
		valor = numero.nextFloat();
		
		for (int x = 1; x <= 50; x++) {

			valor = x * 1.99f;

			System.out.print(x);
			System.out.print("- R$");
			System.out.println(String.format("%.2f", valor));
		}

	}

}
