package repetição;

import java.util.Scanner;

public class Numero19 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		float nota, media = 0;
		int quantidade;

		System.out.print("Digite a quantidade de notas que você deseja realizar a média: ");
		quantidade = numero.nextInt();

		for (int x = 1; x <= quantidade; x++) {

			System.out.print("Digite as notas: ");
			nota = numero.nextFloat();

			media = (media + nota);

		}

		media = media / quantidade;
		System.out.print("A media das notas é: " + media);
	}

}
