package livrariaGama;

import java.sql.*;

public class ConnectionJDBC {
    public static String URL = "jdbc:mysql://localhost:3306/dbloja";
    public static String USR = "root";
    public static String PWD = "root";

    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public void OpenDatabase() throws SQLException {
        try {
            dbconn = DriverManager.getConnection(URL, USR, PWD);
            System.out.println("Conectado à: " + URL);
            sqlmgr = dbconn.createStatement();
        } catch (Exception Error) {
            System.out.println("Erro ao conectar: " + Error.getMessage());
        }
    }

    public void CloseDatabase() throws SQLException {
        sqlmgr.close();
        dbconn.close();
    }

    public int ExecuteQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql);
        } catch (Exception Error) {
            System.out.println("Erro ao conectar: " + Error.getMessage());
        }
        return -1;
    }

    public int ExecuteSelect(String sql) {
        try {
            resultsql = sqlmgr.executeQuery(sql);
            while (resultsql.next()) {
                System.out.println(resultsql.getString(2));
            }
        } catch (Exception Error) {
            System.out.println("Erro ao conectar: " + Error.getMessage());
        }
        return -1;
    }
}
