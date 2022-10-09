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
		
		do {
			do{
				System.out.println("Merci de choisir une option : ");
				System.out.println(lvl1);
				System.out.println(lvl2);
				System.out.println(lvl3);
				System.out.println(lvl4);
				System.out.println(lvl5);
				System.out.println(lvl6);
				System.out.println(quit);
				choix=scan.nextInt();
			}while (choix<1||choix>7);
			
			switch (choix){
				case 1 : MainOfLevel1(); break;
				case 2 : /*MainOfLevel2();*/ break;
				case 3 : /*MainOfLevel3();*/ break;
				case 4 : /*MainOfLevel4();*/ break;
				case 5 : /*MainOfLevel5();*/ break;
				case 6 : /*MainOfLevel6();*/ break;
			}
		}while (choix!=7);
		
		
		scan.close();
		//fin de menu		
	}
	
	public static void MainOfLevel1() {
		
	}
	
	
	
}
