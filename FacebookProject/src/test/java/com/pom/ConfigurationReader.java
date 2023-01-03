package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {
	Properties ps;
	public ConfigurationReader() throws IOException {
		File f=new File("src\\test\\java\\com\\pom\\file.property");
		FileInputStream fis = new FileInputStream(f);
		ps=new Properties();
		ps.load(fis);
}
	   public String Launchrowser() {
		 String browser = ps.getProperty("Browser");
		return browser;
	}
      public String url() {
		String url = ps.getProperty("url");
		return url;

	}
}
