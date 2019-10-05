package main;

import java.util.HashMap;
import java.util.Scanner;

import main.model.Library;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		ApplicationController controller = new ApplicationController();
		Scanner scanner = new Scanner(System.in);
		Library myLibrary = new Library();
		
		try {
			int action = -1;
			while (action != 0) {
				action = (int)controller.doCommand("displayMenu", GetCommandData("scanner", scanner));
				switch (action) {
				case 1:
					controller.doCommand("displayBooks", GetCommandData("library", myLibrary));
					break;
				case 2:
					HashMap<String, Object> commandData = GetCommandData("scanner", scanner);
					commandData.put("library", myLibrary);
					controller.doCommand("addBook", commandData);
					break;
				case 0:
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Unrecognized selection, please try again.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
	
	/**
	 * Get a HashMap containing one data object for Application Controller Commands
	 * @param key Key for the data object
	 * @param value data object
	 * @return HashMap with one command
	 */
	public static HashMap<String, Object> GetCommandData(String key, Object value) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put(key, value);
		return data;
	}
}
