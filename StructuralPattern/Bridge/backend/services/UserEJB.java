package StructuralPattern.Bridge.backend.services;

import StructuralPattern.Bridge.backend.dao.UserDao;
import StructuralPattern.Bridge.backend.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
