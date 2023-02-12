/*
 Crie um algoritmo usando Do While , Switch Case e If que receba o nome de 3 candidatos e em seguida solici-
te N votos a esses candidatos só encerre o programa quando digitar 0 e em seguida, imprima o total de votos
que cada candidato recebeu e apresente que venceu a eleição.
 */

package QuestionSix;

import java.util.Locale;
import java.util.Scanner;

public class QuestionSix {

	public String cand1;
	public static int votos1;
	public String cand2;
	public static int votos2;
	public String cand3;
	public static int votos3;
	public static int esc;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//cadastrando candidatos
		System.out.println("CADASTRO DE CANDIDATOS.");
		System.out.print("Digite o nome do 1º Candidato: ");
		String cand1 = sc.next();
		System.out.print("Digite o nome do 2º Candidato: ");
		String cand2 = sc.next();
		System.out.print("Digite o nome do 3º Candidato: ");
		String cand3 = sc.next();
		
		//sistema de votos
		do {
		System.out.print("TRIBUNAL REGIONAL ELEITORAL\n\n");
		System.out.println("1- CANDIDATO " + cand1 + ".");
        System.out.println("2- CANDIDATO " + cand2 + ".");
        System.out.println("3- CANDIDATO " + cand3 + ".");
        System.out.println("0- ENCERRAR PROGRAMA");
        System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
        esc = sc.nextInt();
        
        
        switch(esc) {
        case 0:
        	System.out.println("ENCERRANDO PROGRAMA...\n");
        	break;
        case 1:
        	System.out.println("VOTO COMPUTADO COM SUCESSO!\n");
        	votos1 ++;
        	break;
        case 2:
        	System.out.println("VOTO COMPUTADO COM SUCESSO!\n");
        	votos2 ++;
        	break;
        case 3:
        	System.out.println("VOTO COMPUTADO COM SUCESSO!\n");
        	votos3 ++;
        	break;
        default:
        	System.out.println("OPÇÃO INVÁLIDA.");
        	break;
        }
		}
        while(esc != 0);
        
        //contagem dos votos
        if(votos1 > votos2) {
        	if (votos1 > votos3) {
        		if(votos3 > votos2) {
        			System.out.println("CANDIDATO " + cand1 + " ELEITO COM UM TOTAL DE " + votos1 + " VOTOS!");
            		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
            		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
            		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
        		}
        		else {
        			System.out.println("CANDIDATO " + cand1 + " ELEITO COM UM TOTAL DE " + votos1 + " VOTOS!");
            		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
            		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
            		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
        		}
        	}
        	else if(votos3 > votos2){
        		System.out.println("CANDIDATO " + cand3 + " ELEITO COM UM TOTAL DE " + votos3 + " VOTOS!");
        		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
        	}
        	
        }
        else if(votos2 > votos3) {
        	if(votos1 > votos3) {
        		System.out.println("CANDIDATO " + cand2 + " ELEITO COM UM TOTAL DE " + votos2 + " VOTOS!");
        		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
        	}
        	else {
        		System.out.println("CANDIDATO " + cand2 + " ELEITO COM UM TOTAL DE " + votos2 + " VOTOS!");
        		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
        		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
        	}
        }
        else {
        	System.out.println("CANDIDATO " + cand3 + " ELEITO COM UM TOTAL DE " + votos3 + " VOTOS!");
    		System.out.println("CANDIDATO " + cand3 + " = " + votos3 + " VOTOS.");
    		System.out.println("CANDIDATO " + cand2 + " = " + votos2 + " VOTOS.");
    		System.out.println("CANDIDATO " + cand1 + " = " + votos1 + " VOTOS.");
        }
        
	}

}