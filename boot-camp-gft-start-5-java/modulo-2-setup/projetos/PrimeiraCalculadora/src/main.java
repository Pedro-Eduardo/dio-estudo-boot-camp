import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo a Calculadora");
		
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Digite o seu primeiro n�mero: ");
		a = scan.nextInt();
		System.out.print(" Digite o seu segundo n�mero: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a, b);
		
		
		System.out.println(" O Resultado da soma do primeiro n�mero: " + a + " e do segundo n�mero: " + b + " � igual � :" + soma);
		System.out.println(" O Resultado da subtra��o do primeiro n�mero: " + a + " e do segundo n�mero: " + b + " � igual � :" + subtracao);
		System.out.println(" O Resultado da divis�o do primeiro n�mero: " + a + " e do segundo n�mero: " + b + " � igual � :" + divisao);
		System.out.println(" O Resultado da multiplica��o do primeiro n�mero: " + a + " e do segundo n�mero: " + b + " � igual � :" + multiplicacao);
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
