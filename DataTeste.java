package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dia");
		int dia = sc.nextInt();
		System.out.println("Mes");
		int mes = sc.nextInt();
		System.out.println("Ano");
		int ano = sc.nextInt();
		
		Data data = new Data(dia, mes, ano);
		
		System.out.println(data.obterDataFormatado());
		data.obterDataFormatada();
		sc.close();
	}

}
