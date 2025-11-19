package seção3;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		double firstOpe = (Math.pow(6 * (3 + 2), 2)) / (3*2);
		double secondOpe = Math.pow((1-5) * (2-7) / 2, 2);
		double thirdOpe =  Math.pow(firstOpe - secondOpe, 3) / Math.pow(10, 3);
		
		System.out.println((int) thirdOpe);
	}

}
