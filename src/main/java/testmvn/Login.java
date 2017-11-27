package testmvn;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void guest(){
		System.out.println("guest login allowed");
	}
	@Test
	public void ldapuser(){
		System.out.println("ldapuser allowed");
	}
@Test
	public void ldapuser1(){
		System.out.println("ldapuser1 allowed");
	}
@Test
	public void ldapusermaster1(){
		System.out.println("ldapusermaster1 allowed");
	}
	
	

}
