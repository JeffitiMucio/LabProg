import java.util.Scanner;


public class MinMax {
	public static void main (String[] args) {
		final int N�MEROS_A_LER = 3;
		Scanner sc = new Scanner (System.in);
		int minimo = Integer.MAX_VALUE;
		int m�ximo = Integer.MIN_VALUE;
		
		for (int i = 0;i < N�MEROS_A_LER; i++) {
			System.out.print("Entre com proximo inteiro:");
			int num = sc.nextInt();
			if (num< minimo) {
				minimo = num;
			}
		    if (num > m�ximo) {
		    	m�ximo = num;
		    	
		    }
			
		  
		}
		
		System.out.println("O menor numero �: "+ minimo);
		System.out.println("O menor numero �: "+ m�ximo);
	}
}
