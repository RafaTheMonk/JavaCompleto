package classe;

public class Produto {
	Double preco; 
	static Double desconto = 25.0;
	
	public Produto(Double preco) {
		this.preco = preco;
	}
	
	public void calcularPagamento() {
		System.out.println(preco -= ((preco*desconto)/100));
	}
}
