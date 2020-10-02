package cst135n.milestone.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataServices {

	// Used to write our objects to text file
	public static void write(List<Dessert> sugarRush) {
		System.out.println("\n\nWRITING OUTPUT ... ");
		try {
			FileOutputStream fos = new FileOutputStream("dessertTray");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sugarRush);
			oos.close();
			fos.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}

	// Used to read our previous objects from a text file
	public static List<Dessert> read() {

		System.out.println("\n\nREADING INPUT ... ");
		// Create an List of Desserts to send back
		List<Dessert> sugarRush = new ArrayList<>();

		try
		{
			FileInputStream fis = new FileInputStream("dessertTray");
			ObjectInputStream ois = new ObjectInputStream(fis);

			sugarRush = (ArrayList<Dessert>) ois.readObject();

			ois.close();
			fis.close();
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return sugarRush;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("Class not found");
			c.printStackTrace();
			return sugarRush;
		}

		return sugarRush;

	}
}
