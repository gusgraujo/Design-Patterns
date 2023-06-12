package CreationalPattern.Factory.factories;

import CreationalPattern.Factory.db.DB;

public interface DBFactory {
    DB getDatabase();
}
