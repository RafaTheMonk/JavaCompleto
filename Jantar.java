package classe;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina 2 pessoas e seus respectivos pesos, repita o mesmo processo para 2 comidas");
		
			System.out.printf("Nome da pessoa 1:\n");
			String nomePessoa = sc.nextLine();
			
			System.out.printf("Peso da pessoa 1:\n");
			Double pesoPessoa = sc.nextDouble();
			sc.nextLine();
			
			Pessoa p1 = new Pessoa(nomePessoa, pesoPessoa);
			
			System.out.printf("Nome da comida 1:\n");
			String nomeComida = sc.nextLine();
			
			System.out.printf("Peso da comida 1:\n");
			Double pesoComida = sc.nextDouble();
			sc.nextLine();
			
			Comida c1 = new Comida(nomeComida, pesoComida);
			
			System.out.printf("Nome da comida 2:\n");
			nomeComida = sc.nextLine();
			
			System.out.printf("Peso da comida 2:\n");
			pesoComida = sc.nextDouble();
			
			Comida c2 = new Comida(nomeComida, pesoComida);
			
			System.out.printf("Seu nome é %s e seu peso é %.2f\n", p1.nome, p1.peso);
			p1.comer(c1);
			p1.comer(c2);
			sc.close();
	}

}
