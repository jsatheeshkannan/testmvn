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
<<<<<<< HEAD
	public void ldapusermaster1(){
		System.out.println("ldapusermaster1 allowed");
	}
	
=======
	public void ldapuser2(){
		System.out.println("ldapuser2 allowed");
	}
>>>>>>> testmvn-br1
	

}
