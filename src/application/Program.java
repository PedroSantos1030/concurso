package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual a quantidade de pessoas? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] note1 = new double[n];
		double[] note2 = new double[n];
		double[] averege = new double[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Digite os dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			sc.nextLine();
			System.out.print("Nota etapa 1: ");
			note1[i] = sc.nextDouble();
			System.out.print("Nota etapa 2: ");
			note2[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("TABELA: ");
		for(int i=0; i<n; i++) {
			averege[i] = (note1[i] + note2[i]) / 2.0;
			System.out.println(name[i] + ", " + note1[i] + ", " + note2[i] + ", MEDIA = " + averege[i]);
		}
		
		System.out.println();
		System.out.println("PESSOAS APROVADAS: ");
		for(int i=0; i<n; i++) {
			if(averege[i] >= 70.0) {
				System.out.println(name[i]);
				}
			else {
				System.out.print("");
			}	
		}
		
		
		
		System.out.println();
		double contApproved = 0.0;
		for(int i=0; i<n; i++) {			
			if (averege[i] >= 70.0) {
				contApproved++;
			}
		}
		
		double percentege = contApproved / n * 100.0;
		System.out.printf("Porcentagem de aprovação: %.1f%n" + "%%", percentege);
		
		
			double larger = 0.0;
			double highestAverege = 0.0;
			String nameAverege = "";

		for(int i=1; i<n; i++) {
			if(averege[i] > larger) {
				larger = averege[i];
				averege[i] = highestAverege ;
				nameAverege = name[i];		
		}
		}
		System.out.printf("Maior média: %s%n", nameAverege);
		
		double averegeApproved = 0.0;
		for(int i=0; i<n; i++) {			
			if (averege[i] >= 70.0) {
				averegeApproved = (note1[i] + note2[i]) / 2.0;
			}
		}
		
		System.out.printf("Nota média dos aprovados: %.2f%n", averegeApproved);
				
		
		sc.close();	
		}

}
