package db;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserList implements DAO<User> {
	private List<User> users;

	public UserList() {
		//Initialize users to empty ArrayList
		users = new ArrayList<>();
	}

	@Override
	public User getById(int id) {
		// loop through user list to find the user who's id matches 'id'
		User u = null;
		
		for(User user: users) {
			if (user.getId()==id) {
				u = user;
			}
		}
		
		return u;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean Add(User u) {
		try {
			users.add(u);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(User t) {
		// not yet implemented
		return false;
	}

	@Override
	public boolean delete(User t) {
		// not yet implemented
		return false;
	}

}
