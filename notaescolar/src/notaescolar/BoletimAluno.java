package notaescolar;

import java.util.Scanner;

public class BoletimAluno {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		String nome;
		String situa��o;
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
			situa��o = "Aluno aprovado";
		}
		
		if(media < 7 || media > 5) {
			situa��o = "Aluno em recupera��o";
		}
		
		else {
			situa��o = " Aluno reprovado";
		}
		
		System.out.println("\n\n");
		System.out.println("----- BOLETIM -----");
		System.out.println("Aluno: " + nome);
		System.out.println("M�dia final: " + media);
		System.out.println("Situa��o: " + situa��o);
		
	}

}
