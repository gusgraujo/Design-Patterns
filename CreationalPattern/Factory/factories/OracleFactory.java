package CreationalPattern.Factory.factories;

import CreationalPattern.Factory.db.DB;
import CreationalPattern.Factory.db.OracleDB;

public class OracleFactory implements DBFactory{

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
