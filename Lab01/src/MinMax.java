import java.util.Scanner;


public class MinMax {
	public static void main (String[] args) {
		final int NÚMEROS_A_LER = 3;
		Scanner sc = new Scanner (System.in);
		int minimo = Integer.MAX_VALUE;
		int máximo = Integer.MIN_VALUE;
		
		for (int i = 0;i < NÚMEROS_A_LER; i++) {
			System.out.print("Entre com proximo inteiro:");
			int num = sc.nextInt();
			if (num< minimo) {
				minimo = num;
			}
		    if (num > máximo) {
		    	máximo = num;
		    	
		    }
			
		  
		}
		
		System.out.println("O menor numero é: "+ minimo);
		System.out.println("O maior numero é: "+ máximo);
	}
}
