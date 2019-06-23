package carrefourDataUtility;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class DataUtility {

	// field

	public int textId;
	public int magasin;
	public int produit;
	public int qte;
	public double prix;
	
	
	
	
	
	// methods
	public static SimpleDateFormat dateTime = new SimpleDateFormat("yyyyMMdd");
	public static DateFormat df = new SimpleDateFormat("yyyyMMdd'T'HHmmss+0100");
	public static Date date = Calendar.getInstance().getTime();
	public static String strDate = dateTime.format(date);
	public static String datetrans = df.format(date);

	
	// public static String getRandomGeneratedString() {
	// // Random random = new Random();
	// // return random.nextInt();
	// byte[] array = new byte[35]; // length is bounded by 35
	// new Random().nextBytes(array);
	// return array.toString();
	//
	// }
	
	// fonctions pour generer l'id du magasin
	public static String generateString() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}

	// fonction pour génerer les prix du produit
	public static float getRandomFloat(float min, float max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((int) ((max - min) + 1)) + min / 1000;
	}
	
	//fonction pour gérer id du transaction
	public static int getRandomIdtrans(int low, int high){
		Random r = new Random();
		int idTrans = r.nextInt(high - low) + low ;
		return idTrans;
		
	}
	
	//fonction pour gérer produit et qte 
	public static int getRandomnumber(){
		Random r = new Random();
		int prod= r.nextInt();
		return prod;
		
	}
	

}
