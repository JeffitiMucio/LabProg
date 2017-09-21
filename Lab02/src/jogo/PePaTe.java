package jogo;

import java.util.Scanner;

public class PePaTe {
    public static void main (String[] args) {
    	
    	int jogador;
    	int computador;
    	Scanner n1 = new Scanner (System.in);
    	Scanner n2 = new Scanner (System.in);
    	
    	while(true) {
    		System.out.println("(1). pedra, (2). papel, (3). tesoura.");
    		System.out.println("Digite a opção desejada:");
    		jogador=n1.nextInt();
    		System.out.println("(1). pedra, (2). papel, (3). tesoura.");
    		System.out.println("Digite a opção desejada:");
    		computador=n2 .nextInt();
    		switch (jogador) {
    		case 1:
    			System.out.println("jogador1 escolheu PEDRA!");
    			break;
    		case 2:
    			System.out.println("jogador1 escolheu PAPEL!");
    			break;
    		case 3:
    			System.out.println("jogador1 escolheu TESOURA!");
    			break;
    		default:
    			System.out.println("Opção invalida");
    			break;

    		}

    		switch (computador) {
    		case 1:
    			System.out.println("Jogador2 escolheu PEDRA!");
    			break;
    		case 2:
    			System.out.println("Jogador2 escolheu PAPEL!");
    			break;
    		case 3:
    			System.out.println("jogador2 escolheu TESOURA!");
    			break;
    		}
    		if (jogador != computador) {
    			if ((jogador==1 && computador ==3) || (jogador==2 && computador==1) || (jogador==3 && computador==2)) {
    				System.out.println("Jogador1 venceu!");
    			} else {
    				System.out.println("Jogador2 venceu!");

    			}	
    		} else {
    			System.out.println("Empate!");

    		}
    		
    		n1.nextLine();
    		final String SAIR = "-1";
    		
    		if(n1.hasNextLine()) {
    			if(n1.nextLine().equals(SAIR))
    				break;
    		}
    	}
    }
}
