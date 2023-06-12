package CreationalPattern.Factory.db;

public class PostGreSQLDB implements DB{

    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Postgres database");
    }
}
