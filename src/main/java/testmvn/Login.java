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
	

}
