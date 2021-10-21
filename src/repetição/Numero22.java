package repetição;

import java.util.Scanner;

public class Numero22 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int votantes, contador1 = 0, contador2 = 0, contador3 = 0;
		char voto;

		System.out.print("Digite o número de votantes: ");
		votantes = numero.nextInt();

		for (int x = 1; x <= votantes; x++) {

			System.out.print("Digite em qual candidato você deseja votar. Digite a, b, ou c: ");
			voto = numero.next().charAt(0);

			if (voto == 'a') {
				contador1++;

			}

			else if (voto == 'b') {
				contador2++;

			}

			else
				contador3++;

		}

		System.out.println("O candidato a recebeu a respectiva quantidade de votos: " + contador1);
		System.out.println("O candidato b recebeu a respectiva quantidade de votos: " + contador2);
		System.out.println("O candidato c recebeu a respectiva quantidade de votos: " + contador3);

	}

}
