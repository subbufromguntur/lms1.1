package com.rms.loyalty.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestUtils {

	public static List<String> readFromFile(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		List<String> items = new ArrayList<String>();
		try {
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				items.add(currentLine);
			}
		} finally {
			reader.close();
		}
		return items;
	}
}
