package DigitalLocker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Authentication {
	//sign in option
	public static void AuthenticPage() {
		
		System.out.println("1.Registration");
		System.out.println("2.Login");
		Scanner input = new Scanner(System.in);
		int option =input.nextInt();
		switch(option) {
		case 1:

			System.out.println("===========================");
			System.out.println("");
			System.out.println("WELCOME TO REGISTRATION PAGE");
			System.out.println("");
			System.out.println("===========================");
			Authentication.Registration();
		    break;
		case 2: 
			
			System.out.println("===========================");
			System.out.println("");
			System.out.println("WELCOME TO LOGIN  PAGE");
			System.out.println("");
			System.out.println("===========================");
			Authentication.Login();
		    break;
		    
		    default:
		    	System.out.println("wrong option selected");
		}
	}
		public static void Registration() {
			
			Scanner scanObj = new Scanner(System.in);
	    	System.out.println("Enter your name");
	    	String name  = scanObj.nextLine();
	    	
	    	System.out.println("Enter your password");
	    	String password = scanObj.nextLine();
	    	
	    	FileOutputStream fos;
	    	try {
	    		
	    		fos= new FileOutputStream("/home/piyupriyapatilg/eclipse-workspace/Phase1-Project/src/DigitalLocker/RegisteredData.txt", true);
	    	PrintWriter pw =new PrintWriter(fos);
	    	pw.println(name);
	    	pw.println(password);
	    	System.out.println("Registered Successfully");
	    	pw.close();
	    	
	    	}catch(FileNotFoundException e) {
	    		e.printStackTrace();
	    		
	    	}
	    	
			
		}
		
		
	
	    public static void Login() {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter your name");
	    	String user = scan.nextLine();
	    	
	    	System.out.println("Enter your password");
	    	String pass = scan.nextLine();
	    	
	    	System.out.println("Logged in Successfully");
	    	Authentication.Credentials();
	    	
	    }  
	    
	    public static void Credentials() {
	    	System.out.println("1.Store Credentials");
			System.out.println("2.Fetch stored credentials");
			Scanner input = new Scanner(System.in);
			int option =input.nextInt();
			switch(option) {
			case 1:

				System.out.println("===========================");
				System.out.println("");
				System.out.println("WELCOME TO STORE CREDENTIALS PAGE");
				System.out.println("");
				System.out.println("===========================");
				Authentication.StoreData();
			    break;
			case 2: 
				
				System.out.println("===========================");
				System.out.println("");
				System.out.println("WELCOME TO FETCH CREDENTIALS");
				System.out.println("");
				System.out.println("===========================");
				Authentication.FetchData();
			    break;
			    
			    default:
			    	System.out.println("wrong option selected");
			} 
	    }
	    
       public static void StoreData() {
    	   

			Scanner scanObj1 = new Scanner(System.in);
	    	System.out.println("Enter your Name:");
	    	String Name  = scanObj1.nextLine();
	    	
	    	System.out.println("Enter your Site Name:");
	    	String site = scanObj1.nextLine();
    	   
	    	System.out.println("Enter your user name:");
	    	String Uname = scanObj1.nextLine();
	    	System.out.println("Enter your password");
	    	String Upassword = scanObj1.nextLine();
	    	
	    	FileOutputStream fos;
	    	try {
	    		
	    		fos= new FileOutputStream("/home/piyupriyapatilg/eclipse-workspace/Phase1-Project/src/DigitalLocker/StoredData.txt", true);
	    	PrintWriter pw =new PrintWriter(fos);
	    	pw.println(Name);
	    	pw.println(site);
	    	pw.println(Uname);
	    	pw.println(Upassword);
	    	System.out.println("Your Data Stored Successfully");
	    	pw.close();
	    	
	    	}catch(FileNotFoundException e) {
	    		e.printStackTrace();
	    		
	    	}
	    	
       }
       public static void FetchData() {
    	   
    	   File fileRead = new File("/home/piyupriyapatilg/eclipse-workspace/Phase1-Project/src/DigitalLocker/StoredData.txt");
    	   
           try {
        	   Scanner scannerReader = new Scanner(fileRead);
        	   while(scannerReader.hasNextLine()) {
        		   
        		  System.out.println(scannerReader.nextLine()); 
        		   
        	   }
        	   
        	   
           }catch(FileNotFoundException e) {
        	   
        	   e.printStackTrace();
           }
          
       }
       
}
