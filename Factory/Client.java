package Factory;

import Factory.db.DB;
import Factory.db.OracleDB;
import Factory.factories.DBFactory;
import Factory.factories.OracleFactory;

public class Client {

    public static void main(String[] args) {
        OracleDB db = new OracleDB();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        //What happen if you have to change for a postgres database?

        //Create a Factory
        DB database = new OracleFactory().getDatabase();
        //		DB db = new PostgresFactory().getDatabase();

        database.query("Select * from table");


    }
}