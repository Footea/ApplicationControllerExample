package main.handlers;

import java.util.HashMap;

import main.model.Library;

public class DisplayBooksHandler implements Handler {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		Library library = (Library) data.get("library");

		String s = library.toString();
		System.out.println(s);
		return null;
	}

}
