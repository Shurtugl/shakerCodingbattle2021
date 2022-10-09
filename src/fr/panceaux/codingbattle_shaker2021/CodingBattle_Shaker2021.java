package fr.panceaux.codingbattle_shaker2021;

import java.util.Scanner;

public class CodingBattle_Shaker2021 {
	public static void main(String[] args){
		//lancement des différents algo demandé au 
		//https://www.isograd-testingservices.com/FR/solutions-challenges-de-code
		//Shaker codingbattle 2021
		
		//main est le menu d'accès aux différents niveaux
		
		final String lvl1 = "1 - Une histoire de couleur";
		final String lvl2 = "2 - Gros tas de bouquins";
		final String lvl3 = "3 - Oh la belle prise";
		final String lvl4 = "4 - Dans de beaux draps";
		final String lvl5 = "5 - Un cad(re)eau empoisonné";
		final String lvl6 = "6 - Estimation de toile";
		final String quit = "7 -Terminer et Quitter";
		int choix;
		
		Scanner scan = new Scanner(System.in);
		do{
			choix=scan.nextInt();
		}while (choix<1||choix>7);
		
		MainOfLevel1();
		
		//fin de menu		
	}
	
	public static void MainOfLevel1() {
		
	}
	
	
	
}
