package repetição;

import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int cd;
		float total = 0, valor, media = 0;

		System.out.print("Digite a quantidade de CDs");
		cd = numero.nextInt();

		for (int x = 1; x <= cd; x++) {

			System.out.println("Digite o valor de cada CD");
			valor = numero.nextInt();

			total = total + valor;
		}

		media = total / cd;

		System.out.println(String.format("O valor total gasto é: %.2f " , total));

		System.out.println(String.format("A média por CD é %.2f : " , media));

	}

}
