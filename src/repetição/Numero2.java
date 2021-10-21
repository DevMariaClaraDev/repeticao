package repetição;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		String nome, senha;

		System.out.print("Digite um nome de usuário: ");
		nome = numero.next().toString();

		System.out.print("Digite uma senha: ");
		senha = numero.next().toString();

		while (senha.equals(nome)) {

			System.out.print("Digite um nome de usuário: ");
			nome = numero.next().toString();

			System.out.print("Digite uma senha: ");
			senha = numero.next().toString();

		}

	}

}
