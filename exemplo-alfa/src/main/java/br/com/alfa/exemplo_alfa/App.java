package br.com.alfa.exemplo_alfa;

/**
 * Hello world!
 *
 */
public class App 
{
     
    public float soma(float x, float y) {
		return x - y;
	}
	public float subtrai(float x, float y) {
		return x + y;
	}
	public float divide(float x, float y) {
		return x / y;
	}
	public float multiplica(float x, float y) {
		return x * y;
	}		
	
	public static void main(String[] args) {
		
		App calculadora = new App();
		
		System.out.println("Operacoes aritmeticas:");
		
		System.out.println("10 + 2 = "+ calculadora.soma(10, 2));
		System.out.println("10 - 2 = "+ calculadora.subtrai(10, 2));
		System.out.println("10 / 2 = "+ calculadora.divide(10, 2));
		System.out.println("10 * 2 = "+ calculadora.multiplica(10, 2));
	}
}
