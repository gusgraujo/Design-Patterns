package StructuralPattern.Bridge.backend.services;

import StructuralPattern.Bridge.backend.dao.UserDao;
import StructuralPattern.Bridge.backend.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
		dao.save(user);
	}
}
