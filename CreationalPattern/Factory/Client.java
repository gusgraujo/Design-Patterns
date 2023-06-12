package CreationalPattern.Factory;

import CreationalPattern.Factory.db.DB;
import CreationalPattern.Factory.db.OracleDB;
import CreationalPattern.Factory.factories.OracleFactory;

public class Client {

    public static void main(String[] args) {
        OracleDB db = new OracleDB();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        //What happen if you have to change for a postgres database?

        //Create a CreationalPattern.Factory
        DB database = new OracleFactory().getDatabase();
        //		DB db = new PostgresFactory().getDatabase();

        database.query("Select * from table");


    }
}