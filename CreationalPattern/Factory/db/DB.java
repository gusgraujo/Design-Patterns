package CreationalPattern.Factory.db;

public interface DB {

    void query(String sql);
    void update(String sql);

}
