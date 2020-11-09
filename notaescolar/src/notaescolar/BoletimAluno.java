package notaescolar;

import java.util.Scanner;

public class BoletimAluno {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		String nome;
		String situação;
		double media;
		double nota1, nota2, nota3, nota4, nota5;
		
		 scanner = new Scanner(System.in);
		
		System.out.println("------------------ \n");
		System.out.print("- Digite seu Nome: ");
		nome = scanner.next();
		
		System.out.print("- [1] Digite uma nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.print("- [2] Digite uma nota:                                                                                                                                                                                                                                                                                ");
		nota2 = scanner.nextDouble();
		
		System.out.print("- [3] Digite uma nota: ");
		nota3 = scanner.nextDouble();
		
		System.out.print("- [4] Digite uma nota: ");
		nota4 = scanner.nextDouble();
		
		System.out.print("- [5] Digite uma nota: ");
		nota5 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4 + nota5) /5;
		
		if(media > 7) {
			situação = "Aluno aprovado";
		}
		
		if(media < 7 || media > 5) {
			situação = "Aluno em recuperação";
		}
		
		else {
			situação = " Aluno reprovado";
		}
		
		System.out.println("\n\n");
		System.out.println("----- BOLETIM -----");
		System.out.println("Aluno: " + nome);
		System.out.println("Média final: " + media);
		System.out.println("Situação: " + situação);
		
	}

}
