package seção3;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] valores = new double[3];
		double soma = 0;
		String salary;
		System.out.println("Digite seus últimos 3 salários:");
		for(int x = 0; x < valores.length; x++) {
			salary = sc.nextLine().replace(",", ".");
			valores[x] = Double.parseDouble(salary);
		}
		for(double x: valores) {
			soma += x;
		}
		
		double media = soma / valores.length;
		
		System.out.println(media);
		
		sc.close();
	}
}
