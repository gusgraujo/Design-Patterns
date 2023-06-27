package StructuralPattern.Bridge.backend.services;

import StructuralPattern.Bridge.backend.dao.UserDao;
import StructuralPattern.Bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
