package com.Swaglabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader 
{
	public Properties p1;
	public PropertiesReader()
	{
		
		//properties
		  p1= new Properties();
	//file
	  File f1 = new File("./"+"\\Config.properties");
	  
	  //read
	  FileInputStream fs;
	try {
		fs = new FileInputStream(f1);
		 //load
		  p1.load(fs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

	 public String getdata(String key)
	  {
		  return p1.getProperty(key);
	  }
}
