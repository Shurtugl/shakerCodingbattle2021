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
		final String quit = "7 - Quitter";
		int choix;
		
		//note : on ouvre le scanner dans chaque fonction mais on ne le ferme qu'à la fin de MAIN
		Scanner scan = new Scanner(System.in);
		
		do {
			do{
				System.out.println("   Merci de choisir une option : ");
				System.out.println("  "+lvl1);
				System.out.println("  "+lvl2);
				System.out.println("  "+lvl3);
				System.out.println("  "+lvl4);
				System.out.println("  "+lvl5);
				System.out.println("  "+lvl6);
				System.out.println("  "+quit);
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
		/* Première épreuve, Une Histoire De Couleur.
		 =>calculer la couleur moyenne issue d'un mélange de deux couleurs C1 et C2.
		ENTREES
		ligne 1, 2 : deux entiers C1 et C2 (0 ≤ C1,C2 ≤ 255) représentant les deux couleurs à mélanger.
	
		SORTIES
		Afficher, sur une seule ligne, la valeur moyenne des couleurs en entrée, arrondie à l'entier supérieur si nécessaire.*/
		
		System.out.println(" ## 1 - Une histoire de couleur ##1");
		Scanner scan = new Scanner(System.in);
		
		int c1 = 0;
		int c2 = 0;
		int moy;
				
		do {
			c1=scan.nextInt();
			c2=scan.nextInt();
		}while (c1<0||c2<0||c1>255||c2>255);
		
		moy =(int)(c1 + c2 + 1);
		moy = (int) (moy/2);
		
		System.out.println(moy);
				
	}
	
	
	
}
