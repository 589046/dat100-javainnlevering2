package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			for (int i : rad) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String obj = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				obj += matrise[i][j] + " ";
			}
			obj += "\n";
		}
		return obj;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int lengde = 0;
		for (int[] i : matrise) {
			lengde = i.length;
		}

		int[][] nyMatrise = new int[matrise.length][lengde];

		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise[j].length; i++) {
				int a = matrise[j][i] * tall;
				nyMatrise[j][i] = a;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
	}
}
