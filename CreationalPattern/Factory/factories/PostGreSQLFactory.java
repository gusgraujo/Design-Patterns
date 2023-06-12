package CreationalPattern.Factory.factories;

import CreationalPattern.Factory.db.DB;
import CreationalPattern.Factory.db.PostGreSQLDB;

public class PostGreSQLFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new PostGreSQLDB();
    }
}
