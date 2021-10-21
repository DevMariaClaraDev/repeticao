package repetição;

import java.util.Scanner;

public class Numero23 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int turmas, alunos, media = 0;
	
	System.out.print("Digite a quantidade de turmas: ");
	turmas = numero.nextInt();
	
	for (int x = 1; x <= turmas; x++) {
	
		System.out.println("Digite o número de alunos por turma. Digite um número até 40: ");
		alunos = numero.nextInt();
		
		if (alunos > 40) {
			System.out.println("Número inválido. Digite novamente");
			x = x - 1;
		}
		
		else 
			media = media + alunos;
		
	}

	media = media/turmas;
	System.out.print("A media de alunos por turma é: " + media);
	
	}

}
