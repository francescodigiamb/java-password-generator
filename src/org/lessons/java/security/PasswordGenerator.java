package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	/*salvare in opportune variabili il
	 *   -nome,
	 *   -cognome,
	 *   -colore preferito
	 *   -e data di nascita di un utente suddivisa in giorno, mese e anno in numero
	 *	generare (e stampare a video) una password  concatenando
	 *  nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, 
	 *  separate dal carattere -
	 */
	
	// basic 
	public static void main(String[] args) //{
	/*String name = "Pinco";
	
	String surname = "Pallo";
	
	int day = 12;
	int month = 5;
	int year = 1994;
	
	String color = "magenta";
	
	int sum = day + month + year;
	
	System.out.println(sum);
	
	String password= name + "-" + surname + "-" + color + "-" + sum;
	
	System.out.println(password);
	*/
	//}
	
	// versione più dinamica 
	
 {
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto nel creatore di password.");
		System.out.println("Inserire i tuoi dati per generare la tua password.");
		
		System.out.println("Inserisci il tuo nome:");
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome:");
		cognome = scan.next();
		
		System.out.println("Inserisci il tuo colore preferito:");
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita:");
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita:");
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita:");
		anno = scan.nextInt();
		
		System.out.println("Calcolando la tua password...");
		
		int somma = giorno + mese + anno;
		
		String password = nome + "-" + cognome + "-" + colore + "-" + somma;
		
		System.out.println(String.format("La tua password è %s", password));
		
	/*	String pwdConcat = nome.concat("-").concat(cognome).concat("-")
							.concat(colore).concat("-").concat("" + somma);
		
		System.out.println(String.format("La tua password è %s", pwdConcat));	
	*/	
	}
}
