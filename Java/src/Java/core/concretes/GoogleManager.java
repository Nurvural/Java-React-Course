package Java.core.concretes;

import Java.core.abstracts.AuthService;

public class GoogleManager implements AuthService{
   
	  @Override
	    public boolean isValidUser() {
	        return new GoogleManager().isValidUser();
	    }
}
