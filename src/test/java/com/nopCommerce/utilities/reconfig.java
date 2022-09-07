package com.nopCommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class reconfig {
	
	Properties pro;
	
	public reconfig() {
		File src=new File("./configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " +e.getMessage());
		}
	}
	
	public String getURL() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}



}
