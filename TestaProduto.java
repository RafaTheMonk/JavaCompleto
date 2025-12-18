package classe;

import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o preço 1:");
		Double preco1 = sc.nextDouble();
		System.out.println("Insira o preço 2:");
		Double preco2 = sc.nextDouble();
		System.out.println("É natal: y / n");
		String op = sc.next();
		if(op.equalsIgnoreCase("y")) {
			Produto.desconto = 30.0;
		}
		
		Produto produto1 = new Produto(preco1);
		Produto produto2 = new Produto(preco2);
		produto1.calcularPagamento();
		produto2.calcularPagamento();
		
		sc.close();
	}

}
