import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo a Calculadora");
		
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Digite o seu primeiro número: ");
		a = scan.nextInt();
		System.out.print(" Digite o seu segundo número: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a, b);
		
		
		System.out.println(" O Resultado da soma do primeiro número: " + a + " e do segundo número: " + b + " é igual à :" + soma);
		System.out.println(" O Resultado da subtração do primeiro número: " + a + " e do segundo número: " + b + " é igual à :" + subtracao);
		System.out.println(" O Resultado da divisão do primeiro número: " + a + " e do segundo número: " + b + " é igual à :" + divisao);
		System.out.println(" O Resultado da multiplicação do primeiro número: " + a + " e do segundo número: " + b + " é igual à :" + multiplicacao);
	}
	
	public  static int soma (int a, int b) {
		
		return a + b;
		
	}
	
	public static int subtracao( int a , int b) {
		
		return a - b;
		
	}
	
	public static int divisao( int a , int b) {
		
		return a/b;
		
	}
	public static int multiplicacao(int a , int b) {
		
		return a * b;
		
	}
	

}
