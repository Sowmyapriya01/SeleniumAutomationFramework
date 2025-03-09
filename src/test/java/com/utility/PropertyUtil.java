package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertyUtil {
//public static void main(String args[]) {
	public static String readProperty(Env qa,String propertyName) {
		File file = new File(System.getProperty("user.dir")+"//config//"+qa+".properties");

		FileReader fileReader= null;
		Properties prop = new Properties(); 
		try {
			 fileReader = new FileReader(file);
			 prop.load(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty(propertyName.toUpperCase()));
	return prop.getProperty(propertyName.toUpperCase())	;
	}
	
}
