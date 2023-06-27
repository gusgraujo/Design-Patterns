package StructuralPattern.Bridge.backend;

import StructuralPattern.Bridge.backend.dao.UserMongoDao;
import StructuralPattern.Bridge.backend.dao.UserMysqlDao;
import StructuralPattern.Bridge.backend.dao.UserOracleDao;
import StructuralPattern.Bridge.backend.dao.UserPostgresDao;
import StructuralPattern.Bridge.backend.model.User;
import StructuralPattern.Bridge.backend.services.UserEJB;
import StructuralPattern.Bridge.backend.services.UserRest;
import StructuralPattern.Bridge.backend.services.UserService;
import StructuralPattern.Bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
