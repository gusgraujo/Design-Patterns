package Factory.factories;

import Factory.db.DB;
import Factory.db.PostGreSQLDB;

public class PostGreSQLFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new PostGreSQLDB();
    }
}
