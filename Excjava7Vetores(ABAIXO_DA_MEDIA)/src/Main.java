import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double  elementostotais = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			elementostotais += vect[i];
		}
		
		double elementomedio = elementostotais / vect.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR: %.3f%n", elementomedio);
		
		System.out.print("ELEMENTOS ABAIXO DA MEDIA:\n");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] < elementomedio) {
				System.out.printf("%.2f%n", vect[i]);
			}
		}
		

		sc.close();
	}
}