package carrefourDataUtility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Calendar;
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

	public static void main(String[] args) {

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
						+ DataUtility.generateString() + "|" + DataUtility.getRandomIdtrans(1, 100) + "|"
						+ DataUtility.getRandomIdtrans(1, 10) + "\r\n");

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

	}

}
