package StructuralPattern.Bridge.backend.dao;

import StructuralPattern.Bridge.backend.model.User;
public class UserMongoDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
