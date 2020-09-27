package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String obj = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			obj += tabell[i];
			if (tabell.length > i + 1) {
				obj += ",";
			}
		}
		return obj + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}

		for (int j : tabell) {
			sum += j;
		}

		return sum / 3; // Deler på siden den summerer tre ganger.
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reverse = new int[tabell.length];
		for (int i = tabell.length - 1; i >= 0; i--) {
			reverse[tabell.length - i - 1] = tabell[i];
		}
		return reverse;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i - 1] > tabell[i]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] kombi = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			kombi[i] = tabell1[i];
		}
		for (int i = tabell1.length; i < kombi.length; i++) {
			kombi[i] = tabell2[i - tabell1.length];
		}
		return kombi;
	}

}
