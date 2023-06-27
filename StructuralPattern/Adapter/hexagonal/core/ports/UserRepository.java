package StructuralPattern.Adapter.hexagonal.core.ports;

import java.util.List;

import StructuralPattern.Adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
