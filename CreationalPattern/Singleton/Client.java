package CreationalPattern.Singleton;

import CreationalPattern.Singleton.connection.Connection;
import CreationalPattern.Singleton.connection.ConnectionPool;

public class Client {
    static ConnectionPool pool = ConnectionPool.getInstance();
    Connection conn = pool.getConnection();
    public static void doQuery1() {
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A1");
        pool.leaveConnection(conn);
    }

    public static void doQuery2() {
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();

        //3 connections was made, even with 2 connections limit
    }
}
