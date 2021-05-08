package Java.business.abstracts;

import Java.dataAccess.abstracts.UserDao;
import Java.entities.concretes.User;

public interface UserrService {

	    boolean isValidFirstName(String firstName);

	    boolean isValidLastName(String lastName);

	    boolean isValidPassword(String password);

	    boolean isValidEmailFormat(String email);

	    boolean isUsedEmail(String email, UserDao userDao);

	    boolean isValidUser(User user, UserDao userDao);

	    boolean isCorrectLoginInput(String email, String password, UserDao userDao);

		boolean isUsedEmail1(String email, UserDao userDao);

		boolean isValidUser1(User user, UserDao userDao);

		boolean isCorrectLoginInput1(String email, String password, UserDao userDao);
}
