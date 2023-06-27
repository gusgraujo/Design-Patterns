package StructuralPattern.Bridge.backend.services;

import StructuralPattern.Bridge.backend.dao.UserDao;
import StructuralPattern.Bridge.backend.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
