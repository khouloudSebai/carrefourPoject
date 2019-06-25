package carrefourDataUtility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Data {

	// fields

	public static int nbMagasin = 1200;
	public static int i;
	public static int j;
	public static int lines;
	public static String repTrans = "/home/khouloud/workspace/carrefourProject/data/transactions";
	public static String repRef = "/home/khouloud/workspace/carrefourProject/data/references";
	public Traitement traitement;
	public static int prod = new DataUtility().getRandomIdtrans(1, 100);
	public static int Qte = new DataUtility().getRandomIdtrans(1, 10);

	public static void main(String[] args) throws IOException {

		// pour des raisons de visibilité
		Writer writer = null;
		try {
			File transactions = new File(repTrans + "_" + "prod" + "_" + DataUtility.strDate + ".data");

			// ouverture d'un flux de sortie sur un fichier
			// a pour effet de créer le fichier
			writer = new FileWriter(transactions);
			// BufferedWriter info = new BufferedWriter(references);

			// écriture dans le fichier
			// writer.write("Bonjour le monde !");
			for (lines = 1; lines < 1000; lines++) {
				writer.write(DataUtility.getRandomIdtrans(1, 1000) + "|" + DataUtility.datetrans + "|"
						+ DataUtility.generateString() + "|" + prod + "|" + Qte + "\r\n");

			}

		} catch (IOException e) {

			// affichage du message d'erreur et de la pile d'appel
			System.out.println("Erreur " + e.getMessage());
			e.printStackTrace();

		} finally {

			// il se peut que l'ouverture du flux ait échoué,
			// et que ce writer n'ait pas été initialisé
			if (writer != null) {

				try {

					// la méthode close de FileWriter appelle elle-même
					// flush()
					writer.close();

				} catch (IOException e) {

					System.out.println("Erreur " + e.getMessage());
					e.printStackTrace();
				}
			}
		}

		while (i < nbMagasin) {
			// Writer writer = null;
			// for (String date : jour) {

			try {
				File references = new File(repRef + "_" + "prod" + "-" + DataUtility.generateString() + "_"
						+ DataUtility.strDate + ".data");

				// ouverture d'un flux de sortie sur un fichier
				// a pour effet de créer le fichier
				writer = new FileWriter(references);
				// BufferedWriter info = new BufferedWriter(references);

				// écriture dans le fichier
				// writer.write("Bonjour le monde !");
				for (lines = 1; lines < 1000; lines++) {
					writer.write(lines + "|" + DataUtility.getRandomFloat(1, 1000) + "\r\n");

				}

			} catch (IOException e) {

				// affichage du message d'erreur et de la pile d'appel
				System.out.println("Erreur " + e.getMessage());
				e.printStackTrace();

			} finally {

				// il se peut que l'ouverture du flux ait échoué,
				// et que ce writer n'ait pas été initialisé
				if (writer != null) {

					try {

						// la méthode close de FileWriter appelle elle-même
						// flush()
						writer.close();

					} catch (IOException e) {

						System.out.println("Erreur " + e.getMessage());
						e.printStackTrace();
					}
				}
			}
			i++;
		}

		// une loop sur les fichiers récupérés
		// List l = Traitement
		// .readFileInList("/home/khouloud/workspace/carrefourProject/data/transactions_prod_20190625.data");
		//
		// Iterator<String> itr = l.iterator();
		// while (itr.hasNext()){
		// int sumQte = DataUtility.qte;
		//
		// }
		// System.out.println(itr.next());

		FileReader in = new FileReader(
				"/home/khouloud/workspace/carrefourProject/data/transactions_prod_20190625.data");
		BufferedReader br = new BufferedReader(in);
		String line = br.readLine();
		while (line != null) {
			line.split("|");
			System.out.println(line);
			line = br.readLine();
		}
		in.close();

	}
}
