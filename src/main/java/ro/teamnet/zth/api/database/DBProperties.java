package ro.teamnet.zth.api.database;

public interface DBProperties {

    String IP = "127.0.0.1";
    String PORT = "3306";
    String SCHEMA = "zth_10";
    String USER = "root";
    String PASS = "root";
    String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    boolean IS_ORACLE = false;
    boolean IS_MYSQL = true;
}
