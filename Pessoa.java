package classe;

public class Pessoa {
	String nome;
	Double peso;
	
	public Pessoa(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
		System.out.printf("Você comeu %s que pesa %.2f logo seu peso foi para %.2f.\n", comida.nome, comida.peso, peso);
	}
}
