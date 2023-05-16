package Factory.factories;

import Factory.db.DB;
import Factory.db.OracleDB;

public class OracleFactory implements DBFactory{

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
