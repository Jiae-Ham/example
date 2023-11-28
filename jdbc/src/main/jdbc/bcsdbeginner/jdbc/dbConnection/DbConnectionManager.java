package bcsdbeginner.jdbc.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DbConnectionManager {
    public static Connection getConnection() throws SQLException {

        try{
            Connection connection = DriverManager.getConnection(DbConnectionConst.URL, DbConnectionConst.USERNAME, DbConnectionConst.PASSWORD);
            log.info("Connection={}", connection);
            return connection;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
