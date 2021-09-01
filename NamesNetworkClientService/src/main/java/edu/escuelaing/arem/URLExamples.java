package edu.escuelaing.arem;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExamples {
	
	 public static void main( String[] args ){
		 try {
			URL myFirstSite = new URL("https://www.google.com/?hl=es");
			System.out.println("The URL is: " + myFirstSite.toString());
			System.out.println("The Host is: " + myFirstSite.getHost());
			System.out.println("The Port is: " + myFirstSite.getPort());
			System.out.println("The Authority is: " + myFirstSite.getAuthority());
			System.out.println("The File is: " + myFirstSite.getFile());
			System.out.println("The Path is: " + myFirstSite.getPath());
			System.out.println("The Protocol is: " + myFirstSite.getProtocol());
			System.out.println("The Query is: " + myFirstSite.getQuery());
			System.out.println("The Reference is: " + myFirstSite.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    }

}
