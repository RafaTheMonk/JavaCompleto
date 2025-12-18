package classe;

public class Data {
	int dia, mes, ano;
	
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String obterDataFormatado() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	public void obterDataFormatada() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
}
