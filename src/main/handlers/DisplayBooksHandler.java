package main.handlers;

import java.util.HashMap;

import main.model.Library;

public class DisplayBooksHandler implements Handler {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		// Don't need any data for this one.
		Library myLibrary = Library.getInstance();
		String s = myLibrary.toString();
		System.out.println(s);
		return null;
	}

}
