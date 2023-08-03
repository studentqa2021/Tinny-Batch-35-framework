package com.util;



import java.io.FileInputStream;
import java.util.Properties;

public   class BaseConfig {

	public static String getConfig(String testData) throws Exception{
		String path="./Environments/dev.properties";
		FileInputStream fis=new FileInputStream( path);
		Properties pro=new Properties();
		 pro.load(fis);
		
String value=		 pro.get(testData).toString();
		
		
		
	return value;	
	}

public static void main(String[] args) throws Exception {
	 
	 System.out.println(BaseConfig.getConfig("URL"));
	 System.out.println(BaseConfig.getConfig("username"));
	 System.out.println(BaseConfig.getConfig("password"));
}
	
	
{
	
	
	
	

			
	

	
	
	



	

}	
		
		
		
		
		
	
}
