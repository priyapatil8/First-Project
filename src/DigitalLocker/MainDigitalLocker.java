package DigitalLocker;

public class MainDigitalLocker {
	
	public static void WelcomePage() {
		
		System.out.println("===========================");
		System.out.println("WELCOME TO LOCKME.COM");
		System.out.println("YOUR PERSONAL DIGITAL LOCKER");
		System.out.println("===========================");
	}


	public static void main(String[] args) {
		
		WelcomePage();
		Authentication.AuthenticPage();
		
		
	}

}
