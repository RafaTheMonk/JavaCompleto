package estruturas_de_controle_break;

import java.util.Scanner;

public class ExercicioEstruturasDeControle {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		switch(menu()) {
			case 1:
				question1();
				break;
			case 2:
				question2();
				break;
			case 3:
				question3();
				break;
			case 4:
				question4();
				break;
			case 5:
				question5();
				break;
			case 6:
				question6();
				break;
			case 7:
				question7();
				break;
			case 8:
				question8();
				break;
			default:
		}
	}
	
	public static void question1() {
		System.out.println("Digite o número:");
		int num = sc.nextInt();
		
		if(num >=0 && num <= 10) System.out.println("Está entre 0 e 10");
		if(num % 2 == 0) System.out.println("É par");
	}
	
	public static void question2() {
		System.out.println("Informe o ano atual:");
		int ano = sc.nextInt();
		
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É ano bissexto");
		} else {
			System.out.println("Não é ano bissexto");
		}
	}
	
	public static void question3() {
		System.out.println("Informe a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		} else if(media > 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		System.out.println("Média: " + media);
	}
	
	public static void question4() {
		System.out.println("Digite um número para verificar se é primo:");
		int numero = sc.nextInt();
		
		if(isPrime(numero)) {
			System.out.println("É número primo");
		} else {
			System.out.println("Não é número primo");
		}
	}
	
	public static void question5() {
		System.out.println("Digite um número para verificar se é primo (usando switch):");
		int numero = sc.nextInt();
		
		int resultado = isPrime(numero) ? 1 : 0;
		
		switch(resultado) {
			case 1:
				System.out.println("É número primo");
				break;
			case 0:
				System.out.println("Não é número primo");
				break;
			default:
		}
	}
	
	public static void question6() {
		int numeroSecreto = (int) (Math.random() * 101);
		int tentativas = 10;
		
		while(tentativas > 0) {
			System.out.println("Tente adivinhar o número (0 a 100). Tentativas restantes: " + tentativas);
			int palpite = sc.nextInt();
			
			if(palpite == numeroSecreto) {
				System.out.println("Acertou! O número era " + numeroSecreto);
				return;
			}
			
			if(palpite > numeroSecreto) {
				System.out.println("O número é menor que " + palpite);
			} else {
				System.out.println("O número é maior que " + palpite);
			}
			
			tentativas--;
		}
		System.out.println("Suas tentativas acabaram. O número era " + numeroSecreto);
	}
	
	public static void question7() {
		int soma = 0;
		int numero = 0;
		
		while(true) {
			System.out.println("Digite um número positivo para somar ou um número negativo para sair:");
			numero = sc.nextInt();
			
			if(numero < 0) {
				break;
			}
			
			soma += numero;
			System.out.println("Soma atual: " + soma);
		}
		
		System.out.println("Programa encerrado. Soma final: " + soma);
	}
	
	public static void question8() {
		int maior = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número:");
			int numero = sc.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior número informado foi: " + maior);
	}
	
	private static boolean isPrime(int numero) {
		if(numero < 2) return false;
		if(numero == 2) return true;
		if(numero % 2 == 0) return false;
		
		for(int i = 3; i * i <= numero; i += 2) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int menu() {
		System.out.println("1 - Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;");
		System.out.println("2 - Criar um programa informa se o ano atual é um ano bissexto; ");
		System.out.println("3 - Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console \"Aprovado\", se a nota for menor que 7.0 e maior do que 4.0 imprime no console \"Recuperação\", caso contrário imprime no console \"Reprovado\". ");
		System.out.println("4 - Criar um programa que receba um número e diga se ele é um número primo. ");
		System.out.println("5 - Refatorar o exercício 04, utilizando a estrutura switch. ");
		System.out.println("6 - Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado. ");
		System.out.println("7 - Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while. ");
		System.out.println("8 - Crie um programa que recebe 10 valores e ao final imprima o maior número. ");
		int op = sc.nextInt();
		return op;
	}
}
