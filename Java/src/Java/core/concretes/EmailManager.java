package Java.core.concretes;

import Java.core.abstracts.EmailService;

public class EmailManager implements EmailService{
	
	  @Override
	    public void sendVerificationMail(String email) {
	        System.out.println("Dogrulama adresi " + email);
	       
	    }
	

}
