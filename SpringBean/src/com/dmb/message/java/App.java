package com.dmb.message.java;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 
public class App {
	public static void main(String[] args) {
 
		ApplicationContext context = new FileSystemXmlApplicationContext("locale/locale.xml");
 
		String name = context.getMessage("customer.name", 
				new Object[] { 28,"test" }, Locale.US);
 
		System.out.println("Customer name (English) : " + name);
 
		String namechinese = context.getMessage("customer.name", 
				new Object[] {28, "test1" }, Locale.SIMPLIFIED_CHINESE);
		
 
		System.out.println("Customer name (Chinese) : " + namechinese);
 
	}
}
