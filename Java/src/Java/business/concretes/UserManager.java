package Java.business.concretes;

import Java.business.abstracts.UserService;
import Java.business.abstracts.UserrService;
import Java.dataAccess.abstracts.UserDao;
import Java.entities.concretes.User;

public class UserManager implements UserService {

	    private final UserDao userDao;
	    private final UserrService userCheckService;
		private UserrService userrService;

	    public UserManager(UserDao userDao, UserrService userrService) {
	        this.userDao = userDao;
	        this.userrService = userrService;
			this.userCheckService = null;
	    }

	    @Override
	    public void register(User user) {
	        if (userrService.isValidUser(user, userDao)) {
	            userDao.add(user);
	            System.out.println("Registration Successful");
	            return;
	        }
	        System.out.println("Registration Failed");
	    }

	    @Override
	    public void login(String email, String password) {
	        if (userrService.isCorrectLoginInput(email, password, userDao)) {
	            System.out.println("User logged in...");
	            return;
	        }
	        System.out.println("Login Failed");
	    }

	    @Override
	    public void update(User user) {
	        if (userrService.isValidUser(user, userDao)) {
	            userDao.update(user);
	            System.out.println("Update Successful");
	            return;
	        }
	        System.out.println("Update Failed");
	    }

	    @Override
	    public void delete(User user) {
	        userDao.delete(user);
	        System.out.println("Delete Successful");
	    }
}
