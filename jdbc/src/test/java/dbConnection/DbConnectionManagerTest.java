package dbConnection;


import bcsdbeginner.jdbc.dbConnection.DbConnectionManager;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;



class DbConnectionManagerTest {

    @Test
    void getConnection() throws SQLException {
        Connection connection = DbConnectionManager.getConnection();
    }
}