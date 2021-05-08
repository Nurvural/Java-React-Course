package Java.dataAccess.abstracts;

import java.util.List;

import Java.entities.concretes.User;

public interface UserDao {
	
	    void add(User user);

	    void update(User user);

	    void delete(User user);

		User get(int id);
		
		User getByEmail(String email);
		
		User getLoginInfos(String email, String password);

	    List<User> getAll();

		List<User> getall();
}
