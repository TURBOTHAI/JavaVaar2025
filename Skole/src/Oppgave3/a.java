package Oppgave3;
import java.util.ArrayList;
import java.util.Arrays;

public class a {
	
	public static void main(String[] args) {
		// vanlige liseter
		int[] tallArray= new int[5];
		int[] tall2Array= {1,2,3,4,5};
		
//	 Opprett en ArrayList som kan inneholde heltall. Legg til 5 elementer (heltall) der to er like. Se
//		også hva som skjer om du prøver å legge til en streng. Skriv ut elementet på plass 4 og 5.
//		Forklar hvorfor du får en feil
		ArrayList<Integer> tallerArrayList = new ArrayList<>();
		ArrayList<Integer> tallerArrayList2 = new ArrayList<>(Arrays.asList(1,2,3,4,2));
		
		System.out.println(tallerArrayList2.get(3));
		System.out.println(tallerArrayList2.get(4));
		System.out.println(tallerArrayList2.size());
		
		for(int i=0;i<tallerArrayList2.size();i++) {
			if (tallerArrayList2.get(i)==2) {
				System.out.println(i);	
			}
		         }
		
		
		
//		System.out.printf(tallerArrayList2.removeAll(tallerArrayList2),tallerArrayList2);
		System.out.println(tallerArrayList2);
		//c) Sjekk om et element finnes i listen. Prøv både med et som finnes og et som ikke finnes.
			}
	
	

	
	
	
	

}
